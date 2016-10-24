/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name MySQLDriver.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.bridge 
 * @Date 2016年6月27日下午2:50:56 
 * @Copyright(c) 2016, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.li.it.Structure.DesignPattern.bridge;

/**
 * @author liyixiang 
 * @Info
 * * * @company leEco
 * * * @email <liyixiang@le.com>
 * * * @GitHub https://github.com/yixiangli
 * * * @Blog http://my.oschina.net/liyixiangBlog/blog
 * @date 2016年6月27日
 * @since JDK 1.7
 * @Function MySQL实现
 * @Reason
 */
public class MySQLDriver implements Driver {

	@Override
	public void connect() {
		// can be used by
		System.out.println("MySQL数据库连接方式");
	}

}
