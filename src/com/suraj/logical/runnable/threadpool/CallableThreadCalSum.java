package com.suraj.logical.runnable.threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThreadCalSum implements Callable<Integer>{
	
	private int num;
	
	public CallableThreadCalSum(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CallableThreadCalSum[] callArr = { new CallableThreadCalSum(20),
				new CallableThreadCalSum(30), new CallableThreadCalSum(40) 
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for (CallableThreadCalSum callableThreadCalSum : callArr) {
			Future<Integer> future = executor.submit(callableThreadCalSum);
			System.out.println(future.get());
		}
		executor.shutdown();
	}
}
