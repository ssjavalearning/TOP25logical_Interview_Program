package com.suraj.binarySearch.divide_concure;

public class BinarySearch {
	
	public static void main(String[] args) {
		int input[] = {2,4,6,8,10,12,14,16,18};
		int key = 2;
		int index = binarySearch(input, key);
		if(index != -1)
			System.out.println(index+" :: index value finding into array");
		else
			System.out.println("unable to find index in input array");
	}

	private static int binarySearch(int[] input, int key) {
		int start = 0;
		int end = input.length - 1;
		while(start <= end) {
			int mid = (start+end)/2;
			if(key == input[mid]) {
				return mid;
			} 
			if (key < input[mid]) {
				end = mid -1;
			} else {
				start = mid +1;
			}
		}
		return -1;
	}
}
