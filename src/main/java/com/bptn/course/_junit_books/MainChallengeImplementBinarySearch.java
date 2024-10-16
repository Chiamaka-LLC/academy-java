package com.bptn.course._junit_books;

import java.util.Arrays;
import java.util.Random;
public class MainChallengeImplementBinarySearch {
    public void Start(){
        
        int[] array = {3, 6, 1, 4, 2, 9, 7, 8, 5, 0};
        int key = 1;


        Arrays.sort(array);

        //sort array
        int result = binarySearch(array,key);

        //Print values in array after sort
        System.out.println(result);

    }

    int binarySearch(int arr[], int key){
       // put your code here.
    	    int low = 0;
    	    int high = arr.length - 1;

    	    while (low <= high) {
    	        int mid = (low + high) / 2;

    	        // Check if the key is present at mid
    	        if (arr[mid] == key) {
    	            return mid;
    	        }

    	        // If key is greater, ignore the left half
    	        if (arr[mid] < key) {
    	            low = mid + 1;
    	        }
    	        // If key is smaller, ignore the right half
    	        else {
    	            high = mid - 1;
    	        }
    	    }
    	    // If we reach here, the element was not present
    	    return -1;
    	
    }
    
       public static void main(String[] args) {
    	   MainChallengeImplementBinarySearch  main = new MainChallengeImplementBinarySearch ();
        main.Start();
    }
}

