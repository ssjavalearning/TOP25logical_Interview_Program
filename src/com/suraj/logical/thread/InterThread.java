package com.suraj.logical.thread;

import java.util.Scanner;

class Buffer{
	String whistle="WHISTLE :";
	String run="RUNNING :\n";
	boolean flag=false;
	public synchronized void whistle(){
		if(flag){try{wait();}catch(Exception ex){}}
		System.out.println(whistle);
		new Scanner(System.in).nextLine();
		flag=true;
		notify();
	}
	public synchronized void run(){
		if(!flag){try{wait();}catch(Exception ex){}}
		System.out.println(run);
		flag=false;
		notify();
	}
}
public class InterThread {
	public static void main(String[] args) {
		Buffer buffer=new Buffer();
		Whistle whistle=new Whistle(buffer);
		Run run=new Run(buffer);
		whistle.start();
		run.start();
	}
}

class Whistle extends Thread {
	Buffer buffer;
	public Whistle(Buffer buffer) {
		this.buffer=buffer;
	}
	public void run() {
		for (int i = 1; i <= 5; i++) {
			buffer.whistle();
		}	
	}
}

class Run extends Thread {
	Buffer buffer;
	public Run(Buffer buffer) {
		this.buffer=buffer;
	}
	public void run() {
		for (int i = 1; i <= 5; i++) {
			buffer.run();
		}
	}
}