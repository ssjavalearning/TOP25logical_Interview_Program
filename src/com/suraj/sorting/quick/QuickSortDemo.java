package com.suraj.sorting.quick;

/**
 *  its run on O(nlog(n))
 * @author suraj singh
 *
 */
public class QuickSortDemo {

	public static void main(String[] args) {
		int[] arr = {10,2,3,11,12,5,6};
		arr = quickSort(arr, 0, 6);
		for (int i : arr) {
			System.out.print(i+"\t");
		}
	}

	private static int[] quickSort(int[] arr, int low, int high) {
		if(low >= high)
			return arr;
		else {
			int q = partition(arr, low, high);
			quickSort(arr, low, q-1);
			quickSort(arr, q+1, high);
		}
		
		return arr;
	}

	private static int partition(int[] arr, int p, int r) {
		int i = p - 1;
		int j = p;
		int pivot = r;
		
		while(j <= pivot) {
			if (arr[j] <= arr[pivot]) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			} else {
				j++;
			}
		}
		return i;
	}

}
