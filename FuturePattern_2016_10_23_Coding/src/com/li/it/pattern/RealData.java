package com.li.it.pattern;

import java.util.concurrent.Callable;

public class RealData implements Callable<String> {//implements Data {

	protected final String result = "";
	
	/**
	public RealData(String para) {
		// RealData�Ĺ�����ܺ�������Ҫ�û��ȴ��ܾã�����ʹ��sleepģ��
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 10; i++) {
			sb.append(para);
			try {
				// ����ʹ��sleep������һ�������Ĳ�������
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
