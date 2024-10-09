package com.bptn.course._01_collections._01_java_map;
import java.util.HashMap;
public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String>numbers = new HashMap<>();
		//Add key-value pairs to the Map using the put method.
		numbers.put(1, "one");
		numbers.put(2, "two");
		numbers.put(3, "three");
		numbers.put(4, "four");
		numbers.put(5, "five");
		numbers.put(6, "six");
		numbers.put(7, "seven");
		numbers.put(8, "eight");
		numbers.put(9, "nine");
		numbers.put(10, "ten");


		//Print out the map generated
		for (Integer i : numbers.keySet()) {
			System.out.println(i + " : " + numbers.get(i));
		}

		//Use the remove() method to remove the value whose key is 7.

		numbers.remove(7);

		//Add another key-value pair for eleven: key: 11, value: eleven.
		numbers.put(11, "eleven");


		//Print out the map generated
		for (Integer i : numbers.keySet()) {
			System.out.println(i + " : " + numbers.get(i));
		}
	}

}
