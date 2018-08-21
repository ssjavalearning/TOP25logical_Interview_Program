package com.suraj.logical.singleton;

public class SingletonClass implements Cloneable{
	
	private static SingletonClass singletonClass = null;
	
	private SingletonClass() { }
	
	public synchronized static SingletonClass getInstance() {
		if(singletonClass == null) {
			singletonClass = new SingletonClass();
		}
		return singletonClass;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
