/** 
 * @Project_Name Structure-DesignPattern 
 * @File_Name Agency.java 
 * @Package_Name com.le.ag.Structure.DesignPattern.proxy 
 * @Date 2016年6月26日下午11:27:08 
 * @Copyright(c) 2016, liyixiang@le.com All Rights Reserved. 
 * 
 */
package com.li.it.Structure.DesignPattern.proxy;

/**
 * @author liyixiang 
 * @Info
 * @date 2016年6月26日
 * @since JDK 1.7
 * @Function 中介 作为房东和租客之间的一个代理 负责租房的各种事宜
 * @Reason 
 */
public class Agency implements Tenant{
	//代表李先生
	private MrLi li;
	
	public Agency() {
		// TODO Auto-generated constructor stub
		super();
		li = new MrLi();
	}
	

	
	@Override
	public void rent() {
		// can be used by
		contactLandlord();
		li.rent();
		chargeAgency();
	}
	
	/**
	 * 
	 * @author liyixiang
	 * @descriptor
	 * @param
	 * @return
	 * @Function 联系房东
	 */
	public void contactLandlord(){
		System.out.println("联系房东");
	}
	
	/**
	 * 
	 * @author liyixiang
	 * @descriptor
	 * @param
	 * @return
	 * @Function 收取中介费
	 */
	public void chargeAgency(){
		System.out.println("收取中介费");
	}

}
