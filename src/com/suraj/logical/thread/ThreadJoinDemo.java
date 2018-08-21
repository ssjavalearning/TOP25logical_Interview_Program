package com.suraj.logical.thread;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		final Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(i +" by"+ Thread.currentThread().getName());
				}
			}
		};
		
		final Thread t2 = new Thread() {
			public void run() {
				try {
					t1.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				for (int i = 11; i <= 20; i++) {
					System.out.println(i +" by"+ Thread.currentThread().getName());
				}
			}
		};
		
		final Thread t3 = new Thread() {
			public void run() {
				try {
					t2.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				for (int i = 21; i <= 30; i++) {
					System.out.println(i +" by"+ Thread.currentThread().getName());
				}
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t3.join();
		System.out.println("main thread completed");
	}

}
