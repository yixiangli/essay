/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name DB2Driver.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.bridge 
 * @Date 2016年6月27日下午2:51:49 
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
 * @Function DB2实现
 * @Reason
 */
public class DB2Driver implements Driver {

	@Override
	public void connect() {
		// can be used by
		System.out.println("DB2数据库连接方式");
	}

}
