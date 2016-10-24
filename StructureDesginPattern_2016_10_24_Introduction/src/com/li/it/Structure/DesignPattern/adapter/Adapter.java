/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name Adapter.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.adapter 
 * @Date 2016年6月27日下午1:57:41 
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
 * @Function 类适配器
 * @Reason
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		// can be used by
		System.out.println("标准功能");
	}

}
