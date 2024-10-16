package com.bptn.course._junit_books;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class MainChallengeImplementBinarySearchTest {
	 private final MainChallengeImplementBinarySearch searchClass = new MainChallengeImplementBinarySearch();

	@Test
	public void testEmptyArray() {
        // Test case 1: Empty array
        int[] array1 = {};
        int result1 = binarySearch(array1, 5);
        assertEquals(-1, result1);
	}
	 @Test
	    public void testSingleElementArrayKeyPresent() {
        // Test case 2: Single-element array, key present
        int[] array2 = {5};
        int result2 = binarySearch(array2, 5);
        assertEquals(0, result2);
	 }
	 @Test
	    public void testSingleElementArrayKeyNotPresent() {
        // Test case 3: Single-element array, key not present
        int[] array3 = {5};
        int result3 = binarySearch(array3, 0);
        assertEquals(-1, result3);
	 }
	 @Test
	    public void testEvenNumberOfElementsUnsorted() {
        // Test case 4: Even number of elements, unsorted
        int[] array4 = {2, 1}; // Sorting is required before using binary search
        Arrays.sort(array4); // Sort the array
        int result4 = binarySearch(array4, 1);
        assertEquals(0, result4);
	 }
	 @Test
	    public void testOddNumberOfElementsUnsorted() {
        // Test case 5: Odd number of elements, unsorted
        int[] array5 = {5, 1, 4}; // Sorting is required before using binary search
        Arrays.sort(array5); // Sort the array
        int result5 = binarySearch(array5, 4);
        assertEquals(1, result5);
    }

    private int binarySearch(int[] array4, int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		MainChallengeImplementBinarySearch  main = new MainChallengeImplementBinarySearch();
        main.Start();
    }
}