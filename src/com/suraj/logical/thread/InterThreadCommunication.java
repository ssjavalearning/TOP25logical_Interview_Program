package com.suraj.logical.thread;

class Bank {
	
	private int amount = 10000;
	
	public synchronized void withdraw(int amt) {
		System.out.println(Thread.currentThread().getName()+"::is going to withdraw amount that is:::"+amt);
		if(this.amount < amt) {
			try {
				System.out.println("amount is not sufficient, going to invoke the deposite thread");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		amount = amount - amt;
		System.out.println(Thread.currentThread().getName()+":: got successfully withdral money now balance is::"+amount);
		
	}
	
	public synchronized void deposite(int amt) {
		System.out.println(Thread.currentThread().getName()+":: is going to deposite the money");
		this.amount = this.amount + amt;
		System.out.println(Thread.currentThread().getName()+" :: is deposited the money successfully and notify the withdral thread to complete their process");
		notify();
	}
}

class Withdraw implements Runnable{
	
	private Bank bank;
	private int amount;
	private Thread t;
	
	public Withdraw(Bank bank, int amount, String name) {
		this.bank = bank;
		this.amount = amount;
		
		t = new Thread(this, name);
		t.start();
	}
	
	public void run() {
		bank.withdraw(amount);
	}
}

class Deposite implements Runnable {
	
	private Bank bank;
	private int amount;
	private Thread t;

	public Deposite(Bank bank, int amount, String name) {
		this.bank = bank;
		this.amount = amount;
		
		t = new Thread(this, name);
		t.start();
	}
	
	public void run() {
		bank.deposite(amount);
	}
	
	
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		
		final Bank bank = new Bank();
		Withdraw withdraw = new Withdraw(bank, 15000, "withdraw thread:");
		Deposite deposite = new Deposite(bank, 10000, "deposite thread:");
	}
}
