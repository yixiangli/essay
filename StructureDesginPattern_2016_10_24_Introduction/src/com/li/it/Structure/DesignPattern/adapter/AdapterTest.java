/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name AdapterTest.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.adapter 
 * @Date 2016年6月27日下午2:00:33 
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
 * @Function 适配器模式测试类
 * @Reason
 */
public class AdapterTest {

	public static void main(String[] args) {
		// can be used by
		abstractAdapterTest();
	}

	/**
	 * 
	 * @author liyixiang
	 * @descriptor
	 * @param
	 * @return
	 * @Function 类适配器测试
	 */
	public static void adapterTest(){
		Target t = new Adapter();
		t.specificRequest();
		t.request();
	}
	
	/**
	 * 
	 * @author liyixiang
	 * @descriptor
	 * @param
	 * @return
	 * @Function 对象适配器测试
	 */
	public static void wrapperTest(){
		Target w = new Wrapper();
		w.specificRequest();
		w.request();
	}
	
	/**
	 * 
	 * @author liyixiang
	 * @descriptor
	 * @param
	 * @return
	 * @Function 接口适配器测试
	 */
	public static void abstractAdapterTest(){
		Target c = new ConcreteTarget();
		c.request();
	}
}
