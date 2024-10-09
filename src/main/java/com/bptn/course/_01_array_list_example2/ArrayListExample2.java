package com.bptn.course._01_array_list_example2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		 // Create an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Iterate using an enhanced for loop (for-each loop)
        System.out.println("Using enhanced for loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
      //Iterate using a traditional for loop
        System.out.println("\nUsing traditional for loop:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
         }
        // Iterate using a while loop with Iterator
        System.out.println("\nUsing while loop with Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }
    }
}
