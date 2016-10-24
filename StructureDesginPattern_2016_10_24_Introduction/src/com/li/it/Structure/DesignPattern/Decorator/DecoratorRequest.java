/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name DecoratorRequest.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.Decorator 
 * @Date 2016年6月30日下午2:44:58 
 * @Copyright(c) 2016, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.li.it.Structure.DesignPattern.Decorator;

/**
 * @author liyixiang 
 * @Info
 * * * @company leEco
 * * * @email <liyixiang@le.com>
 * * * @GitHub https://github.com/yixiangli
 * * * @Blog http://my.oschina.net/liyixiangBlog/blog
 * @date 2016年6月30日
 * @since JDK 1.7
 * @Function 请求包装类 装饰类 为原类新增了功能
 * @Reason
 */
public class DecoratorRequest implements Request{

	private Request request;
	
	public DecoratorRequest(Request request) {
		// TODO Auto-generated constructor stub
		super();
		this.request = request;
	}
	
	@Override
    public void handlerRequest() {
        System.out.println("before decorator!");
        request.handlerRequest();
        System.out.println("after decorator!");
    }
}
