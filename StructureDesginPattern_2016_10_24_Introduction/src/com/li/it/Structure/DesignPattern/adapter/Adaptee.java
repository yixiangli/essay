/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name OldInterface.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.adapter 
 * @Date 2016年6月27日下午1:49:33 
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
 * @Function 被适配者
 * @Reason
 */
public class Adaptee {

	public void specificRequest() {
		System.out.println("被适配类具有的特殊功能...");
	}
}
