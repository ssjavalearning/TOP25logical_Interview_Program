package com.suraj.logical.reverse;

public class StringReverseProgram {

	public static void main(String[] args) {
		String str = "abcde";
		String rev = reverse(str);
		String rev1 = reverse2ndWay(str);
		String rev2 = reverse3rdWay(str);
		System.out.println(rev2);
	}
	
	private static String reverse3rdWay(String str) {
		char[] charArr = str.toCharArray();
		int length = charArr.length; 
		for (int i = 0; i < length/2; i++) {
			char temp = charArr[i];
			charArr[i] = charArr[length-1-i];
			charArr[length-1-i] = temp;
		}
		return new String(charArr);
	}

	private static String reverse2ndWay(String str) {
		//return new StringBuffer(str).reverse().toString();
		return new StringBuilder(str).reverse().toString();
	}

	private static String reverse(String str) {
		if(str.length() <= 1)
			return str;
		else
			return reverse(str.substring(1)) + str.charAt(0);
	}
}
