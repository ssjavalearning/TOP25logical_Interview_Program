package com.suraj.logical.doubleton;

public class DoubletonTest {

	public static void main(String[] args) {

		Doubleton doubleton1 = Doubleton.getInstance();
		Doubleton doubleton2 = Doubleton.getInstance();
		Doubleton doubleton3 = Doubleton.getInstance();
		Doubleton doubleton4 = Doubleton.getInstance();
		Doubleton doubleton5 = Doubleton.getInstance();
		Doubleton doubleton6 = Doubleton.getInstance();

		System.out.println(doubleton1 == doubleton2);

		System.out.println(doubleton1.hashCode());
		System.out.println(doubleton2.hashCode());
		System.out.println(doubleton3.hashCode());
		System.out.println(doubleton4.hashCode());
		System.out.println(doubleton5.hashCode());
		System.out.println(doubleton6.hashCode());
	}

}
