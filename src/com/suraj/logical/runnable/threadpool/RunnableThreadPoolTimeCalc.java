package com.suraj.logical.runnable.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableThreadPoolTimeCalc implements Runnable{

	private String name; 
	
	public RunnableThreadPoolTimeCalc(String name) {
		this.name = name;
		
	}
	
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		System.out.println(Thread.currentThread().getName()+" :: entering into process to completing the task:::"+System.currentTimeMillis());
		long inTime = System.currentTimeMillis();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long outTime = System.currentTimeMillis();
		long totTime = outTime - inTime;
		System.out.println(Thread.currentThread().getName()+" :: going out after completing the task and time total time taken by :+"+System.currentTimeMillis()+":"+totTime);
	}
	
	public static void main(String[] args) {
		
		RunnableThreadPoolTimeCalc[] taskArr = {
				new RunnableThreadPoolTimeCalc("suraj"),
				new RunnableThreadPoolTimeCalc("abhi"),
				new RunnableThreadPoolTimeCalc("guru"),
				new RunnableThreadPoolTimeCalc("nebasish"),
				new RunnableThreadPoolTimeCalc("supriya") 
				};
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for (RunnableThreadPoolTimeCalc runnableThreadPoolTimeCalc : taskArr) {
			executor.submit(runnableThreadPoolTimeCalc);
		}
		
		executor.shutdown();
		System.out.println(Thread.currentThread().getName()+" :: completing his task");
		
	}
}
