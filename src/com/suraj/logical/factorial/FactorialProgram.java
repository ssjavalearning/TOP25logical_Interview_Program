package com.suraj.logical.factorial;

public class FactorialProgram {

	public static void main(String[] args) {
		int factorial1 = getFactorial(5);
		int withoutRecursion = getFactorialWithSimple(5);
	
		System.out.println(factorial1);
		System.out.println(withoutRecursion);
		
		
	}

	private static int getFactorialWithSimple(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact*i;
		}
		return fact;
	}

	private static int getFactorial(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * getFactorial(num - 1);
		}
	}
}
