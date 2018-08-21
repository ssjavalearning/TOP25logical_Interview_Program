package com.suraj.sorting.merge;

/**
 * Its run on O(nlog(n))
 * @author suraj singh
 *
 */
public class MergeSortDemo {
	public static void main(String[] args) {
		int arr[] = {5,1,3,4,2};
		int res[] = mergeSort(arr);
		for (int i : res) {
			System.out.print(i+"\t");
		}
	}

	private static int[] mergeSort(int[] res) {
		if (res.length == 1)
			return res;
		else {
			int mid = res.length/2;
			int k = 0;
			int arr[] = new int[mid];
			int brr[] = new int[res.length-mid];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = res[k++];
			}
			for (int i = 0; i < brr.length; i++) {
				brr[i] = res[k++];
			}
			arr = mergeSort(arr);
			brr = mergeSort(brr);
			res = merge(arr,brr);
		}
		return res;
	}

	private static int[] merge(int[] arr, int[] brr) {
		int res[] = new int[arr.length + brr.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < arr.length && j < brr.length) {
			if (arr[i] < brr[j]) {
				res[k++] = arr[i++];
			} else {
				res[k++] = brr[j++];
			}
		}
		while (i < arr.length) {
			res[k++] = arr[i++];
		}
		while (j < brr.length) {
			res[k++] = brr[j++];
		}
		return res;
	}
}
