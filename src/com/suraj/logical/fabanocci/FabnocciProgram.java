package com.suraj.logical.fabanocci;

public class FabnocciProgram {
	
	public static void main(String[] args) {
		for (int i = 0; i <=5; i++) {
			System.out.print(getFabnocciSeries(i) +" ");
		}
		System.out.println();
		getFabbSeries(5);
	}
	
	public static int getFabnocciSeries(int number) {
		
		if (number == 0 || number == 1) {
			return number;
		} else {
			return getFabnocciSeries(number-1) + getFabnocciSeries(number-2);
		}
	}
	
	public static void getFabbSeries(int number) {
		
		int first = 0;
		int second = 1;
		int third = first + second;
		System.out.print(first+" "+second+" ");
		
		while(third <= number) {
			System.out.print(third+" ");
			first = second;
			second = third;
			third = first + second;
		}
	}
}
