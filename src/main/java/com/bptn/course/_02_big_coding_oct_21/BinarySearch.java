package com.bptn.course._02_big_coding_oct_21;
import java.util.Arrays;

public class BinarySearch {

	// Binary search method that takes an unsorted array and a key element to search for
		public static int binarySearch(int[] arr, int key) {
			// Sort the array before applying binary search
			int[] sortedArr = Arrays.copyOf(arr, arr.length); // Create a copy to sort
	        Arrays.sort(sortedArr);
			
			// Initialize low and high pointers for the start and end of the array respectively
			int low = 0;
	        int high = sortedArr.length - 1;

			// Keep looping until the high pointer is greater than or equal to the low pointer
			while (low <= high) {
				
				// Calculate the middle index
				int mid = (low + high) / 2;
				// If the element at the middle index is equal to the key, return the index
				if (sortedArr[mid] == key) {
					return mid;
				}
				// If the element at the middle index is less than the key, move the low pointer to the middle + 1
				else if (sortedArr[mid] < key) {
					 low = mid + 1;
				}
				// If the element at the middle index is greater than the key, move the high pointer to the middle - 1
				else {
					
					 high = mid - 1;
				}
			}
			// If the key is not found, return -1
			return -1;
		}

	    //Do not modify the code below
		public static void main(String[] args) {

			// Create an Array of integers
			int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
			// Key to be searched for:
			int key = 22;

			// Perform binary search on the Array
			int result = binarySearch(arr, key);

			// Print the result
			if (result == -1) {
				System.out.println("Element not found in the array");
			} else {
				System.out.println("Element found at index " + result);
			}
		}
	}

/*
Summary:
This task was new as it involved implementing binary search on a sorted array. 
I learned about array sorting and handling index updates. Issues included returning the wrong values and syntax errors, which I resolved. 
In future implementations, I’ll ensure clarity on input requirements and avoid modifying original data.
*/