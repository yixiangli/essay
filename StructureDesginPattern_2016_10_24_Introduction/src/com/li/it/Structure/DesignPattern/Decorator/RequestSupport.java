/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name RequestSupport.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.Decorator 
 * @Date 2016年6月30日下午2:46:45 
 * @Copyright(c) 2016, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.li.it.Structure.DesignPattern.Decorator;

/**
 * @author liyixiang 
 * @Info
 * * * @company leEco
 * * * @email <liyixiang@le.com>
 * * * @GitHub https://github.com/yixiangli
 * * * @Blog http://my.oschina.net/liyixiangBlog/blog
 * @date 2016年6月30日
 * @since JDK 1.7
 * @Function
 * @Reason
 */
public class RequestSupport implements Request{

	public void handlerRequest(){
		System.out.println("handlerRequest");
	}
	
}
