package com.li.it.client.proxy;

import java.lang.reflect.Method;
import java.util.UUID;

import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;

import com.li.it.client.RpcClient;
import com.li.it.client.discovery.ServiceDiscovery;
import com.li.it.po.RpcRequest;
import com.li.it.po.RpcResponse;
/**
 * 客户端RPC调用代理
 */
public class RpcProxy {

	private String serverAddress;
    private ServiceDiscovery serviceDiscovery;
 
    public RpcProxy(String serverAddress) {
        this.serverAddress = serverAddress;
    }
 
    public RpcProxy(ServiceDiscovery serviceDiscovery) {
        this.serviceDiscovery = serviceDiscovery;
    }
 
    /**
     * 生成代理
     * @param interfaceClass
     * @return
     */
    @SuppressWarnings("unchecked")
    public <T> T create(Class<?> interfaceClass) {
        return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(),new Class<?>[]{interfaceClass},
            new InvocationHandler() {
        		//RPC调用
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    RpcRequest request = new RpcRequest(); // 创建并初始化 RPC 请求
                    request.setRequestId(UUID.randomUUID().toString());
                    request.setClassName(method.getDeclaringClass().getName());
                    request.setMethodName(method.getName());
                    request.setParameterTypes(method.getParameterTypes());
                    request.setParameters(args);
 
                    if (serviceDiscovery != null) {
                    	// 发现服务
                        serverAddress = serviceDiscovery.discover(); 
                    }
 
                    String[] array = serverAddress.split(":");
                    String host = array[0];
                    int port = Integer.parseInt(array[1]);
                    // 初始化 RPC 客户端
                    RpcClient client = new RpcClient(host, port); 
                    // 通过 RPC 客户端发送 RPC 请求并获取 RPC 响应
                    RpcResponse response = client.send(request); 
 
                    if (response.getError() != null) {
                        throw response.getError();
                    } else {
                        return response.getResult();
                    }
                }
            }
        );
    }
}
