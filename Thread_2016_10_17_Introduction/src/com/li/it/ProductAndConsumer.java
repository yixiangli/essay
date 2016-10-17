package com.li.it;

/**
 * 
 * @author liyixiang
 * 用什么加锁就用什么notify和wait，实例中使用的是LOCK
 */
public class ProductAndConsumer {

	private static Integer count = 0; 
	private final Integer FULL = 10; 
	private static String LOCK = "LOCK"; 
	
	class Producer implements Runnable { 
		@Override 
		public void run() { 
			for (int i = 0; i < 10; i++) { 
				try { 
					Thread.sleep(3000); 
				} catch (Exception e) { 
					e.printStackTrace(); 
				} synchronized (LOCK) { 
					while (count == FULL) { 
						try { 
							LOCK.wait(); 
						} catch (Exception e) { 
							e.printStackTrace(); 
						}
					} 
					count++; 					
					System.out.println(Thread.currentThread().getName() + "生产者生产，目前总共有" + count); 
					LOCK.notifyAll(); 
				} 
			} 
		} 
	} 
	
	class Consumer implements Runnable { 
		@Override 
		public void run() { 
			for (int i = 0; i < 10; i++) { 
				try { 
					Thread.sleep(3000); 
				} catch (InterruptedException e1) { 
					e1.printStackTrace(); 
				} synchronized (LOCK) { 
					while (count == 0) { 
						try { 
							LOCK.wait(); 
						} catch (Exception e) { 
							// TODO: handle exception 
							e.printStackTrace(); 
						} 
					} count--; 
					System.out.println(Thread.currentThread().getName() + "消费者消费，目前总共有" + count); 
					LOCK.notifyAll(); 
				} 
			} 
		} 
	} 
	
	public static void main(String[] args) throws Exception { 
		ProductAndConsumer hosee = new ProductAndConsumer(); 
		new Thread(hosee.new Producer(),"生产者1号").start(); 
		new Thread(hosee.new Consumer(),"消费者1号").start(); 
		new Thread(hosee.new Producer(),"生产者2号").start(); 
		new Thread(hosee.new Consumer(),"消费者2号").start(); 
		new Thread(hosee.new Producer(),"生产者3号").start(); 
		new Thread(hosee.new Consumer(),"消费者3号").start(); 
		new Thread(hosee.new Producer(),"生产者4号").start(); 
		new Thread(hosee.new Consumer(),"消费者4号").start(); 
	}

}

