package com.li.it;

/**
 * 
 * @author liyixiang
 *
 */
public class MultiThreadBasic {

	
/**  线程启动 **/
	public void newThread(){
		Thread thread = new Thread();
		thread.start();
	}
	
	public void newThreadForError(){
		Thread thread = new Thread();
		thread.run();
	}
	
	
	public void startThread(){
		Thread thread = new Thread("t1")
		{
			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName());
			}
		};
		thread.start();
	}
	
	public void runThread(){
		Thread thread = new Thread("t1")
		{
			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName());
			}
		};
		thread.run();
	}

	
/**  线程中断 **/	
	
	//切忌不要使用  Thread.stop()
	public void stopThread(){
		Thread thread = new Thread("t1");
		//@Deprecated 过时
		thread.stop();
	}
	
	//中断三种方式
	//public void Thread.interrupt() // 中断线程 
	//public boolean Thread.isInterrupted() // 判断是否被中断 
	//public static boolean Thread.interrupted() // 判断是否被中断，并清除当前中断状态
	
	
	//退让
	//yield();

	public static void main(String[] args) {
		MultiThreadBasic m = new MultiThreadBasic();
		//m.newThreadForError();
		//m.newThread();
		//m.startThread();
		m.runThread();
	}

	
	
	
}
