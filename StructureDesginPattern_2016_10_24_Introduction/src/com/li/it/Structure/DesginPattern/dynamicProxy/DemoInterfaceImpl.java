/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name DemoInterfaceImpl.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.proxy 
 * @Date 2016å¹?7???13??¥ä?????4:08:58 
 * @Copyright(c) 2016, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.li.it.Structure.DesginPattern.dynamicProxy;


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
public class DemoInterfaceImpl implements DemoInterface {

	@Override
	public void save() {
		// can be used by
		System.out.println("save success");
	}

}
