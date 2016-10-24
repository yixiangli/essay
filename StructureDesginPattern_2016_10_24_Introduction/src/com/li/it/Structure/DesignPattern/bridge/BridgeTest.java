/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name BridgeTest.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.bridge 
 * @Date 2016年6月27日下午2:56:41 
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
 * @Function
 * @Reason
 */
public class BridgeTest {

	public static void main(String[] args) {
		// can be used by
		DriverManager driverManager = new DriverManagerOne();
        Driver driver1 = new MySQLDriver();
        driverManager.setDriver(driver1);
        driverManager.connect();
 
        Driver driver2 = new DB2Driver();
        driverManager.setDriver(driver2);
        driverManager.connect();
	}

}
