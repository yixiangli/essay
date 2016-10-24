/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name CPU.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.Facade 
 * @Date 2016年6月30日下午2:57:24 
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
 * @Function cpu
 * @Reason
 */
public class CPU {

	public void startup() {
        System.out.println("cpu startup!");
    }
 
    public void shutdown() {
        System.out.println("cpu shutdown!");
    }
}
