package com.suraj.sorting.selection;

/**
 * Its run on O(n^2)
 * @author suraj singh
 *
 */
public class SelectionSort {
	
	public static void main(String[] args) {
		int arr[] = {7,8,5,4,9,2};
		System.out.println("before sorting ===>");
		for (int i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println("\nafter sorting ===>");
		arr = selectionSort(arr);
		for (int i : arr) {
			System.out.print(i+"\t");
		}
	}

	private static int[] selectionSort(int[] arr) {
		int minValue, minIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			minValue = arr[i];
			minIndex = i;
			for (int j = i; j < arr.length; j++) {
				if(arr[j] < minValue) {
					minValue = arr[j];
					minIndex = j;
				}
			}
			if (minValue < arr[i]) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		return arr;
	}
}
