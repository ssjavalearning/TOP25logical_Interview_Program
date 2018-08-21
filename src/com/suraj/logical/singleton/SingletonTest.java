package com.suraj.logical.singleton;

public class SingletonTest {
	
	public static void main(String[] args) {
		
		SingletonClass singletonClass1 = SingletonClass.getInstance();
		SingletonClass singletonClass2 = SingletonClass.getInstance();
		SingletonClass singletonClass3 = SingletonClass.getInstance();
		SingletonClass singletonClass4 = SingletonClass.getInstance();
		SingletonClass singletonClass5 = SingletonClass.getInstance();
		SingletonClass singletonClass6 = SingletonClass.getInstance();
		
		System.out.println(singletonClass1 == singletonClass2);
		
		System.out.println(singletonClass1.hashCode());
		System.out.println(singletonClass2.hashCode());
		System.out.println(singletonClass3.hashCode());
		System.out.println(singletonClass4.hashCode());
		System.out.println(singletonClass5.hashCode());
		System.out.println(singletonClass6.hashCode());
	}
}
