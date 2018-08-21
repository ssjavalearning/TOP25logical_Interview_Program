package com.suraj.logical.doubleton;

public class Doubleton implements Cloneable{
	
	private static Doubleton doubleton1 = null;
	private static Doubleton doubleton2 = null;
	
	private Doubleton() {}
	
	public static synchronized Doubleton getInstance() {
		if (doubleton1 == null) {
			doubleton1 = new Doubleton();
			return doubleton1;
		} else if (doubleton2 == null) {
			doubleton2 = new Doubleton();
			return doubleton2;
		} else {
			if (Math.random() < 0.5) {
				return doubleton1;
			} else {
				return doubleton2;
			}
		}
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
