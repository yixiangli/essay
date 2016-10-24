/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name MrLi.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.proxy 
 * @Date 2016年6月26日下午11:30:37 
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
 * @Function 李先生 一个具体的租客
 * @Reason
 */
public class MrLi implements Tenant {

	@Override
	public void rent() {
		// can be used by
		System.out.println("我希望租一个一居室，价格在2500以下!");
	}

}
