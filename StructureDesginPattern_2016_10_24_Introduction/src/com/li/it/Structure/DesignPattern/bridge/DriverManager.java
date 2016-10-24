/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name DriverManager.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.bridge 
 * @Date 2016年6月27日下午2:52:49 
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
 * @Function Astraction 抽象
 * @Reason
 */
public abstract class DriverManager {

	private Driver driver;
	 
    public void connect() {
        driver.connect();
    }
 
    public Driver getDriver() {
        return driver;
    }
 
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
