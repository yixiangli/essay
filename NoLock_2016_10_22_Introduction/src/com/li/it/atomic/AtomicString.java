package com.li.it.atomic;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 只有一个线程能够修改值，并且后面的线程都不能再修改。 
 * @author liyixiang
 *
 */
public class AtomicString {

	public final static AtomicReference<String> atomicString = new AtomicReference<String>("hosee");

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			final int num = i;
			new Thread() {
				public void run() {
					try {
						Thread.sleep(Math.abs((int)Math.random()*100));
					} catch (Exception e) {
						e.printStackTrace();
					}
					//对于this这个类上的偏移量为valueOffset的变量值如果与期望值expect相同，那么把这个变量的值设为update
					if (atomicString.compareAndSet("hosee", "ztk")){
						System.out.println(Thread.currentThread().getId() + "Change value");
					}else {
						System.out.println(Thread.currentThread().getId() + "Failed");
					}
				};
			}.start();
		}
	}


}
