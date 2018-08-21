package com.suraj.logical.triple_ton;

public class ThreetonTest {

	public static void main(String[] args) {

		Threeton treeton1 = Threeton.getInstance();
		Threeton treeton2 = Threeton.getInstance();
		Threeton treeton3 = Threeton.getInstance();
		Threeton treeton4 = Threeton.getInstance();
		Threeton treeton5 = Threeton.getInstance();
		Threeton treeton6 = Threeton.getInstance();
		Threeton treeton7 = Threeton.getInstance();
		Threeton treeton8 = Threeton.getInstance();
		Threeton treeton9 = Threeton.getInstance();
		Threeton treeton10 = Threeton.getInstance();
		Threeton treeton11 = Threeton.getInstance();
		Threeton treeton12 = Threeton.getInstance();

		System.out.println(treeton1 == treeton2);

		System.out.println(treeton1.hashCode());
		System.out.println(treeton2.hashCode());
		System.out.println(treeton3.hashCode());
		System.out.println(treeton4.hashCode());
		System.out.println(treeton5.hashCode());
		System.out.println(treeton6.hashCode());
		System.out.println(treeton7.hashCode());
		System.out.println(treeton8.hashCode());
		System.out.println(treeton9.hashCode());
		System.out.println(treeton10.hashCode());
		System.out.println(treeton11.hashCode());
		System.out.println(treeton12.hashCode());
		
	}

}
