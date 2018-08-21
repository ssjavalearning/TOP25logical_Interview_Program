package com.suraj.sorting.bubble;

/**
 * Its run on O(n^2) 
 * @author suraj singh
 *
 */
public class BubbleSort {
	
	public static void main(String[] args) {
		
		int arr[] = {4,1,20,5,3};
		System.out.println("before sorting===>");
		for (int i : arr) {
			System.out.print(i+"\t");
		}
		arr = bubbleSort(arr);
		System.out.println("\nafter sorting==>");
		for (int i : arr) {
			System.out.print(i+"\t");
		}
	}

	private static int[] bubbleSort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
