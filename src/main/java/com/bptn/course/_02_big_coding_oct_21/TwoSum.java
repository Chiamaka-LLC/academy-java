package com.bptn.course._02_big_coding_oct_21;
import java.util.Map;
import java.util.HashMap;

public class TwoSum {
	// Method that returns the indices of two elements in the nums array that add up
		// to the target value
		public int[] twoSum(int[] nums, int target) {
			// Initialize a HashMap to store the value of each element in the nums array and its index
			Map<Integer, Integer> map = new HashMap<>();

			// Loop through each element in the nums array
			for (int i = 0; i < nums.length; i++) {
				// Calculate the complement, which is the difference between the target and the 
				// current element
				int complement = target - nums[i];

				// Check if the complement is found in the HashMap using containsKey()
				if (map.containsKey(complement)) {
					/* If the complement is found, return an array containing the index of the complement and the current index because these two indices correspond to two elements that add up to the target*/
					return  new int [] {map.get(complement), i };
				}
				// If the complement is not found, put the current element and its index into the HashMap
				map.put(nums[i], i);
			}

			// If no two sum solution is found, throw an IllegalArgumentException
			throw new IllegalArgumentException("No two sum solution");
		}
	    // Do not modify the code below:
		// Main method to test the twoSum method
		public static void main(String[] args) {
			// Example array of integers
			int[] nums = { 2, 7, 11, 15 };

			// Example target value
			int target = 9;

			// Create a TwoSum object
			TwoSum solution = new TwoSum();

			// Call the twoSum method to get the indices of the two elements that add up to
			// the target value
			int[] indices = solution.twoSum(nums, target);

			// Print the result
			System.out.println("The indices are: " + indices[0] + " and " + indices[1]);
		}
	}

/*
Summary:
This task introduced me to using a HashMap for efficient lookups while solving the Two Sum problem.
 I learned how to calculate complements and check for their existence in the map. 
 One challenge I encountered was ensuring the correct handling of indices, but I resolved it through careful coding. 
 In the future, I will remember to leverage HashMaps for optimizing searches and data retrieval in similar problems.
*/