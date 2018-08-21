package com.suraj.logical.thread;

class Addition1 {
	private int x;
	private int y;

	public synchronized void add(int x, int y) {
		System.out.println(Thread.currentThread().getName()
				+ " entering in add method to initilize the variable that is::"
				+ x + " and " + y);

		this.x = x;
		this.y = y;

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int res = this.x + this.y;
		System.out
				.println(Thread.currentThread().getName()
						+ " calculating the result of given two integer value after coming sleep::::"
						+ res);

	}
}

public class AdditionWithSync {

	public static void main(String[] args) {

		Addition1 addition = new Addition1();

		Thread thread1 = new Thread() {
			public void run() {
				addition.add(50, 60);
			}
		};
		thread1.start();

		Thread thread2 = new Thread() {
			public void run() {
				addition.add(70, 80);
				;
			}
		};
		thread2.start();
	}
}
