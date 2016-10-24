/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name Test.java 
 * @Package_Name com.le.ag.Structure.DesginPattern.dynamicProxy 
 * @Date 2016�?7???13??��?????4:14:06 
 * @Copyright(c) 2016, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.li.it.Structure.DesginPattern.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @author liyixiang 
 * @Info
 * * * @company leEco
 * * * @email <liyixiang@le.com>
 * * * @GitHub https://github.com/yixiangli
 * * * @Blog http://my.oschina.net/liyixiangBlog/blog
 * @date 
 * @since JDK 1.7
 * @Function
 * @Reason
 */
public class Test {

	public static void main(String[] args) {
		// can be used by
		DemoInterface first = new DemoInterfaceImpl();
		/*DemoSecond second = new DemoSecondImpl();*/
		
		//创建代理对象
		DemoInterface firstProxy = (DemoInterface) Proxy.newProxyInstance(first.getClass().getClassLoader(), first.getClass().getInterfaces(),new DynamicProxy(first));
		//执行操作
		firstProxy.save();
		
		/*DemoSecond secondProxy = (DemoSecond) Proxy.newProxyInstance(second
		        .getClass().getClassLoader(), second.getClass().getInterfaces(), 
		    new InvocationHandlerImpl(second));
		secondProxy.saveSecond();*/
	}

}
