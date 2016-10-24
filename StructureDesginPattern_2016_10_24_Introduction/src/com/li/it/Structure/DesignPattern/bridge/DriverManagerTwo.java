/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name DriverManagerTwo.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.bridge 
 * @Date 2016年6月27日下午2:55:38 
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
 * @Function 扩展抽象类2
 * @Reason
 */
public class DriverManagerTwo extends DriverManager {

	public void connect() {
		System.out.println("before");
        super.connect();
        System.out.println("after");
    }
}
