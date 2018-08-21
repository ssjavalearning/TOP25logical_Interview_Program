package com.suraj.logical.thread;

class SyncTest2 extends Thread{
	public static int count=0;
	public void run(){
		for(int i=1;i<=1000;i++){
			increment();
		}
	}
	public synchronized void increment(){
		count++;
	}
}
public class WithSync {
	public static void main(String[] args) throws InterruptedException{
		SyncTest2 syncTest=new SyncTest2();
		Thread th1=new Thread(syncTest);
		Thread th2=new Thread(syncTest);
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		System.out.println(syncTest.count);
	}
}