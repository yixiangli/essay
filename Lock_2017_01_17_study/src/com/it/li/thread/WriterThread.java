package com.it.li.thread;

import com.it.li.model.DataModel;

/**
 * 
 * @author liyixiang
 * 写线程
 */
public class WriterThread extends Thread {
	 
    private final DataModel data;
    private final String str;
    private int index = 0;
 
    public WriterThread(DataModel data, String str) {
        this.data = data;
        this.str = str;
    }
 
    @Override
    public void run() {
    	//死循环写
        while (true) {
            char c = next();
            data.write(c);
        }
    }
 
    private char next() {
        char c = str.charAt(index);
        index++;
        if (index >= str.length()) {
            index = 0;
        }
        return c;
    }
}
