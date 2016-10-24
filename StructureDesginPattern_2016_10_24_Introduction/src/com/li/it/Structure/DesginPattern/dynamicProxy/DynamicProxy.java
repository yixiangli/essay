/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name DynamicProxy.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.proxy 
 * @Date 2016å¹?7???13??¥ä?????4:07:53 
 * @Copyright(c) 2016, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.li.it.Structure.DesginPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author liyixiang 
 * @Info
 * * * @company leEco
 * * * @email <liyixiang@le.com>
 * * * @GitHub https://github.com/yixiangli
 * * * @Blog http://my.oschina.net/liyixiangBlog/blog
 * @date 2016å¹?7???13???
 * @since JDK 1.7
 * @Function
 * @Reason
 */
public class DynamicProxy implements InvocationHandler{

	 private Object target;
	 
	 public DynamicProxy(Object target) {
		 this.target = target;
	 }
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// can be used by
		System.out.println("target : " + target.getClass().getName());
		System.out.println("proxy : " + proxy.getClass().getName());
		System.out.println("method : " + method.getName());
		System.out.println("args ï¼? " + args);
		System.out.println("å¼?å§?è®°å????¥å??");
		Object obj = method.invoke(target, args);
		System.out.println("ç»????è®°å????¥å??");
	
		return null;
	}

	
}
