/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name ProxyTest.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.proxy 
 * @Date 2016年6月26日下午11:37:15 
 * @Copyright(c) 2016, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.li.it.Structure.DesignPattern.proxy;

/**
 * @author liyixiang 
 * @Info
 * * * @company leEco
 * * * @email <liyixiang@le.com>
 * * * @GitHub https://github.com/yixiangli
 * * * @Blog http://my.oschina.net/liyixiangBlog/blog
 * @date 2016年6月26日
 * @since JDK 1.7
 * @Function 代理模式测试类
 * @Reason
 */
public class ProxyTest {

	public static void main(String[] args) {
		// can be used by
		Tenant tenant = new Agency();
		tenant.rent();
	}

}
