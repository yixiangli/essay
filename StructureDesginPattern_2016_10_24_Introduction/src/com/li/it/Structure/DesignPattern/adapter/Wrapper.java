/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name Wrapper.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.adapter 
 * @Date 2016年6月27日下午2:03:02 
 * @Copyright(c) 2016, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.li.it.Structure.DesignPattern.adapter;

/**
 * @author liyixiang 
 * @Info
 * * * @company leEco
 * * * @email <liyixiang@le.com>
 * * * @GitHub https://github.com/yixiangli
 * * * @Blog http://my.oschina.net/liyixiangBlog/blog
 * @date 2016年6月27日
 * @since JDK 1.7
 * @Function 对象适配器
 * @Reason
 */
public class Wrapper implements Target {

	private Adaptee adaptee;
	
	public Wrapper() {
		// TODO Auto-generated constructor stub
		super();
		adaptee = new Adaptee();
	}
	
	@Override
	public void request() {
		// can be used by
		System.out.println("标准功能");
	}

	@Override
	public void specificRequest() {
		// can be used by
		adaptee.specificRequest();
	}

}
