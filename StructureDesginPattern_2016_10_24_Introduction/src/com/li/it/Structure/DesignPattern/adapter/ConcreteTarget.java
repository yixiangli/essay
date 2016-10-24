/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name ConcreteTarget.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.adapter 
 * @Date 2016年6月27日下午2:08:03 
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
 * @Function
 * @Reason
 */
public class ConcreteTarget extends AbstractAdapter {

	@Override
	public void request() {
		// can be used by
		//super.request();
		System.out.println("只改变标准方法，不改变特殊功能方法");
	}
}
