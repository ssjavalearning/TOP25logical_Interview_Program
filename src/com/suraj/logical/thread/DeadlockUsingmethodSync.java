package com.suraj.logical.thread;

class Shared {
	
	public synchronized void m1(Shared s) {
		System.out.println(Thread.currentThread().getName()+" :: is entering the method 1  and calling method 2" );
		s.m2(this);
		System.out.println(Thread.currentThread().getName()+" :: is executed method 2");
	}
	
	public synchronized void m2(Shared s) {
		System.out.println(Thread.currentThread().getName()+" :: is entering the method 2  and calling method 1" );
		s.m1(this);
		System.out.println(Thread.currentThread().getName()+" :: is executed method 1");
	}
}

public class DeadlockUsingmethodSync {
	
	public static void main(String[] args) {
		final Shared s1 = new Shared();
		final Shared s2 = new Shared();
		
		Thread t1 = new Thread("first") {
			public void run() {
				s1.m1(s2);
			}
		};
		
		Thread t2 = new Thread("second") {
			public void run() {
				s2.m2(s1);
			}
		};
		t1.start();
		t2.start();
		
	}
}
