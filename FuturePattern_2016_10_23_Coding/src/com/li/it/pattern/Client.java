package com.li.it.pattern;

public class Client {
	public Data request(final String queryStr) {         
		final FutureData future = new FutureData();         
		new Thread() {
			public void run() 
			{
				// RealData�Ĺ���������           
				//�����ڵ������߳��н���                
				RealData realdata = new RealData(queryStr);                 
				future.setRealData(realdata);             
			}                                                        
		}.start();         
		return future; // FutureData�ᱻ��������     
	} 
}
