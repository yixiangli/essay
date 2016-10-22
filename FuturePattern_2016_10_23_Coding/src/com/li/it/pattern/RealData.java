package com.li.it.pattern;

import java.util.concurrent.Callable;

public class RealData implements Callable<String> {//implements Data {

	protected final String result = "";
	
	/**
	public RealData(String para) {
		// RealData的构造可能很慢，需要用户等待很久，这里使用sleep模拟
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 10; i++) {
			sb.append(para);
			try {
				// 这里使用sleep，代替一个很慢的操作过程
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
		result = sb.toString();
	}
	
	public String getResult() {
		return result;
	}
	**/
	
	private String para;

	public RealData(String para) {
		this.para = para;
	}

	@Override
	public String call() throws Exception {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 10; i++) {
			sb.append(para);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
		}
		return sb.toString();
	}
}
