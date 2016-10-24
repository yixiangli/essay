/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name AbstractAdapter.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.adapter 
 * @Date 2016年6月27日下午2:07:14 
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
 * @Function 接口适配器
 * @Reason
 */
public abstract class AbstractAdapter implements Target {

	@Override
	public void request() {
		// can be used by
		System.out.println("标准功能");
	}

	@Override
	public void specificRequest() {
		// can be used by
		System.out.println("被适配类具有的特殊功能...");
	}

}
