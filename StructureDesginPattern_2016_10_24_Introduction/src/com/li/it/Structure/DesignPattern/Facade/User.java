/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name User.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.Facade 
 * @Date 2016年6月30日下午3:01:27 
 * @Copyright(c) 2016, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.li.it.Structure.DesignPattern.Facade;

/**
 * @author liyixiang 
 * @Info
 * * * @company leEco
 * * * @email <liyixiang@le.com>
 * * * @GitHub https://github.com/yixiangli
 * * * @Blog http://my.oschina.net/liyixiangBlog/blog
 * @date 2016年6月30日
 * @since JDK 1.7
 * @Function
 * @Reason
 */
public class User {

	public static void main(String[] args) {
		// can be used by
		ComputerFacade computer = new ComputerFacade();
        computer.startup();
        computer.shutdown();
	}

}
