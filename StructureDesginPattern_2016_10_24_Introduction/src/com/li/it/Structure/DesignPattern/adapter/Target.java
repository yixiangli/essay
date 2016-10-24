/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name Target.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.adapter 
 * @Date 2016年6月27日下午1:53:44 
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
 * @Function 改造后的接口 用于实现对外需求
 * @Reason
 */
public interface Target {

	public void request();
	
	public void specificRequest();
}
