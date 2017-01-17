package com.it.li.thread;

import com.it.li.model.DataModel;

/**
 * 
 * @author liyixiang
 * 读线程
 */
public class ReaderThread extends Thread {
	 
    private final DataModel data;
 
    public ReaderThread(DataModel data) {
        this.data = data;
    }
 
    @Override
    public void run() {
        while (true) {
            String result = data.read();
            System.out.println(Thread.currentThread().getName() + " => " + result);
        }
    }
}
