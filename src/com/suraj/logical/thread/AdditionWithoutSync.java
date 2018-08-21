package com.suraj.logical.thread;

class Addition {
	private int x;
	private int y;
	public void add(int x ,int y) {
		System.out.println(Thread.currentThread().getName()+" entering in add method to initilize the variable that is::"+x+" and "+y);
		
		this.x=x;
		this.y=y;
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int res = this.x + this.y;
		System.out.println(Thread.currentThread().getName()+" calculating the result of given two integer value after coming sleep::::"+res);
	
	}
}

class AdditionUtility implements Runnable {

	private int x;
	private int y;
	private Addition addition;
	private Thread t;
	
	public AdditionUtility(Addition addition, int x, int y, String name) {
		this.addition = addition;
		this.x = x;
		this.y = y;
	
		t = new Thread(this, name);
		t.start();
	}
	
	public void run() {
		addition.add(x, y);
	}
}

public class AdditionWithoutSync {

	public static void main(String[] args) {
		
		Addition addition = new Addition();
		
		AdditionUtility additionUtility = new AdditionUtility(addition, 50, 60, "first");
		AdditionUtility additionUtility1 = new AdditionUtility(addition, 70, 80, "second");
	}
}
