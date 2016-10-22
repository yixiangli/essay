package com.li.it.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池
 * @author liyixiang
 *
 */
public class Pool {

	//new FixedThreadPool 固定数量的线程池，线程池中的线程数量是固定的，不会改变。
	//new SingleThreadExecutor 单一线程池，线程池中只有一个线程。
	//new CachedThreadPool 缓存线程池，线程池中的线程数量不固定，会根据需求的大小进行改变。
	//new ScheduledThreadPool 计划任务调度的线程池，用于执行计划任务，比如每隔5分钟怎么样，
	
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
	corePoolSize 线程池中核心线程数的数目
	maximumPoolSize 线程池中最多能容纳多少个线程
	keepAliveTime 当现在线程数目大于corePoolSize时，超过keepAliveTime时间后，多出corePoolSize的那些线程将被终结。
	unit keepAliveTime的单位
	workQueue 当任务数量很大，线程池中线程无法满足时，提交的任务会被放到阻塞队列中，线程空闲下来则会不断从阻塞队列中取数据。
	**/
}
