package com.bptn.course._01_insert_position;

public static int searchInsert(int[] nums, int target) {

	/*Given a sorted array of distinct integers and a target value, 
	return the index if the target is found. 
	If not, return the index where it would be if it were inserted in order.
			*/
			
	  // Add the content of your method starting here
    int n = nums.length;
    for (int i = 0; i < n; i++){
        if (nums[i] >= target){
            return i;
        }
    }
    return n;

}


