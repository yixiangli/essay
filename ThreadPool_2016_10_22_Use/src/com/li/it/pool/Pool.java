package com.li.it.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * �̳߳�
 * @author liyixiang
 *
 */
public class Pool {

	//new FixedThreadPool �̶��������̳߳أ��̳߳��е��߳������ǹ̶��ģ�����ı䡣
	//new SingleThreadExecutor ��һ�̳߳أ��̳߳���ֻ��һ���̡߳�
	//new CachedThreadPool �����̳߳أ��̳߳��е��߳��������̶������������Ĵ�С���иı䡣
	//new ScheduledThreadPool �ƻ�������ȵ��̳߳أ�����ִ�мƻ����񣬱���ÿ��5������ô����
	
	public static ExecutorService newFixedThreadPool(int nThreads) {
        return new ThreadPoolExecutor(nThreads, nThreads,
                                      0L, TimeUnit.MILLISECONDS,
                                      new LinkedBlockingQueue<Runnable>());
	}


	public static ExecutorService newSingleThreadExecutor() {
	        return new ThreadPoolExecutor(1, 1,
	                                    0L, TimeUnit.MILLISECONDS,
	                                    new LinkedBlockingQueue<Runnable>());
	}


	public static ExecutorService newCachedThreadPool() {
	        return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
	                                      60L, TimeUnit.SECONDS,
	                                      new SynchronousQueue<Runnable>());
	}
	
	/**
	public ThreadPoolExecutor(int corePoolSize,
            int maximumPoolSize,
            long keepAliveTime,
            TimeUnit unit,
            BlockingQueue<Runnable> workQueue) {
			this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue,
					Executors.defaultThreadFactory(), defaultHandler);
	}
	 **/
	
	/**
	corePoolSize �̳߳��к����߳�������Ŀ
	maximumPoolSize �̳߳�����������ɶ��ٸ��߳�
	keepAliveTime �������߳���Ŀ����corePoolSizeʱ������keepAliveTimeʱ��󣬶��corePoolSize����Щ�߳̽����սᡣ
	unit keepAliveTime�ĵ�λ
	workQueue �����������ܴ��̳߳����߳��޷�����ʱ���ύ������ᱻ�ŵ����������У��߳̿���������᲻�ϴ�����������ȡ���ݡ�
	**/
}
