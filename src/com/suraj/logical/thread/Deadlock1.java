package com.suraj.logical.thread;

public class Deadlock1 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (obj1) {
					System.out.println("get obj1 lock-- thread1");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					synchronized (obj2) {
						System.out.println("get obj2 lock-- thread1");
					}
				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (obj2) {
					System.out.println("get obj2 lock-- thread2");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					synchronized (obj1) {
						System.out.println("get obj2 lock-- thread2");
					}
				}
			}
		}).start();
	}
}
