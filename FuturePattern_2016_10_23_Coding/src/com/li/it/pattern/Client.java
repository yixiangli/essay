package com.li.it.pattern;

public class Client {
	public Data request(final String queryStr) {         
		final FutureData future = new FutureData();         
		new Thread() {
			public void run() 
			{
				// RealData的构建很慢，           
				//所以在单独的线程中进行                
				RealData realdata = new RealData(queryStr);                 
				future.setRealData(realdata);             
			}                                                        
		}.start();         
		return future; // FutureData会被立即返回     
	} 
}
