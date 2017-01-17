package com.it.li.test;

import com.it.li.model.DataModel;
import com.it.li.thread.ReaderThread;
import com.it.li.thread.WriterThread;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataModel data = new DataModel(10);
		 
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
 
        new WriterThread(data, "ABCDEFGHI").start();
        new WriterThread(data, "012345789").start();
	}

}
