package com.li.it;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++){
			new Thread(new Runnable() {			
				@Override
				public void run() {
					// TODO Auto-generated method stub
					addA();
				}
			}).start();
		}
		System.out.println("结果为"+Test.a);
	}
	

	private static int a = 0;
	private static volatile int b = 0;
	
	public static void addA(){
		//System.out.println("start : "+a);
		a++;
		//System.out.println("end : "+a);
	}
	
	public static void addB(){
		//System.out.println("start : "+b);
		b++;
		//System.out.println("end : "+b);
	}

}
