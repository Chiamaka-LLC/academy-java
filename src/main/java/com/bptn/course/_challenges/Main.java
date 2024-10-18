package com.bptn.course._challenges;

import java.util.Arrays;

public class Main {

	public static void main(String args[]) {
		int[] arr = { 12, 11, 13, 5, 6, 7 };
		System.out.print("Printing original array: ");
		System.out.println(Arrays.toString(arr));

		// sort array
		mergeSort(arr, 0, arr.length - 1);

		System.out.print("Printing sorted array: ");
		System.out.println(Arrays.toString(arr));

	}

	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	static void merge(int arr[], int l, int m, int r) {
		// Get sub-arrays from arr, based on the indexes provided - copy values from arr into temp left and right arrays.
		// While both sub-arrays are not empty, copy the smallest value from either of them into the right position in arr. 
		// Then copy the remaining part of the non-empty sub-array into the rest of the space in arr. 
		int n1 = m - l + 1;
		int n2 = r - m;
		// Create temporary arrays
		int[] L = new int[n1];
		int[] R = new int[n2];

		// Copy data to temp arrays
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		// Merge the temp arrays

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		// Copy remaining elements of L[] if any
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[] if any
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	static void mergeSort(int arr[], int l, int r) {
		// Add code here
		if (l < r) {
			int m = l + (r-l)/2;

			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}
}