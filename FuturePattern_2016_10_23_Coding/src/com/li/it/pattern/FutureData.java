package com.li.it.pattern;

public class FutureData implements Data {
	protected RealData realdata = null;   //FutureData��RealData�İ�װ     
	protected boolean isReady = false;    
	
	public synchronized void setRealData(RealData realdata) {         
		if (isReady) {              
			return;         
		}         
		this.realdata = realdata;         
		isReady = true;         
		notifyAll();    //RealData�Ѿ���ע�룬֪ͨgetResult()     
	}     
	
	public synchronized String getResult()//��ȴ�RealData�������         
	{  
		while (!isReady) {             
			try {                 
				wait();    //һֱ�ȴ���֪��RealData��ע��            
			} catch (InterruptedException e) {             
			}         
		}         
		return realdata.result;  //��RealDataʵ��       
	} 
}
