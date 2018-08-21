package com.suraj.sorting.insertion;

/**
 * Its run on O(n^2)
 * @author suraj singh
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {5,8,1,3,9,6};
		System.out.println("before sorting ==>");
		for (int i : arr) {
			System.out.print(i+"\t");
		}
		arr = insertionSort(arr);
		System.out.println("\nafter sorting ==>");
		for (int i : arr) {
			System.out.print(i+"\t");
		}
	}

	private static int[] insertionSort(int[] arr) {
		int key, j;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while(j>=0 && key < arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
		}
		return arr;
	}

}
