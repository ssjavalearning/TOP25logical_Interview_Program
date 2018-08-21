package com.suraj.logical.permutation;

public class StringPermutationDemo {
	private static int count = 1;
	
	public static void main(String[] args) {
		String input = "1234";
		permutate("", input);
	}

	private static void permutate(String permutation, String input) {
		if(input.length() == 0) 
			System.out.println(permutation + " new  "+count++);
		else {
			for (int i = 0; i < input.length(); i++) {
				permutate(permutation + input.charAt(i), input.substring(0,i)+input.substring(i+1, input.length()));
			}
		}
			
	}
}
