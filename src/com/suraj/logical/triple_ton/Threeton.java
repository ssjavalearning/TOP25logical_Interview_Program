package com.suraj.logical.triple_ton;

public class Threeton {

	private static Threeton treeton1 = null;
	private static Threeton treeton2 = null;
	private static Threeton treeton3 = null;
	
	private static int count = 0;
	private Threeton() {}
	
	public static synchronized Threeton getInstance() {
		if (treeton1 == null) {
			treeton1 = new Threeton();
			++count;
			return treeton1;
		} else if (treeton2 == null) {
			treeton2 = new Threeton();
			++count;
			return treeton2;
		} else if(treeton3 == null) {
			treeton3 = new Threeton();
			++count;
			return treeton3;
		} else {
			if(count % 3==0) {
				++count;
				return treeton1;
			} else if (count%3 ==1) {
				++count;
				return treeton2;
			} else {
				++count;
				return treeton3;
			}
		}
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
