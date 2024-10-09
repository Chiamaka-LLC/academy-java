package com.bptn.course._01_tree_set_manipulation;
import java.util.Set;
import java.util.TreeSet;
public class TreeSetManipulation {

	public static void main(String[] args) {
		//Create a TreeSet named set and populate it
		Set<String> set = new TreeSet<>();

		// Adding elements
		set.add("A");
		set.add("B");
		set.add("C");

		// Print the size of the set
		System.out.println("Set size: " + set.size());
		System.out.println("Elements in set: " + set);
		// Use the first() method to get the first element in the set, then print it out.
		String firstElement = ((TreeSet<String>) set).first();
		System.out.println("First element: " + firstElement);

		// Use the last() method to get the last element in the set, then print it out.	
		String lastElement = ((TreeSet<String>) set).last();
		System.out.println("Last element: " + lastElement);

		// Use the headSet() method to get the elements in the set that are strictly less than the element B.  
		Set<String> headSet = ((TreeSet<String>) set).headSet("B");
		System.out.println("Elements less than 'B': " + headSet);
		// Use the tailSet() method to get the elements in the set that are greater than or equal to B.
		Set<String> tailSet = ((TreeSet<String>) set).tailSet("B");
		System.out.println("Elements greater than or equal to 'B':" + tailSet);
		// Use subSet() method to get the elements in the set that are greater than or equal to a lower bound and less than an upper bound. In this case, the elements between A (inclusive) and C (exclusive).
		Set<String> subSet = ((TreeSet<String>) set).subSet("A", "C");
		System.out.println("Elements between 'A'(inclusive) and 'C'(exclusive):  " + subSet);

		// Use contains() method to check if the element "B" exists in the set
		System.out.print("Does the set contain 'B'? ");
		if (set.contains("B")) {
			System.out.println("true");
		} else {
			System.out.println("Element 'B' does not exist in the set.");			     										

		}
		// Use remove() method to remove the element B from the set
		set.remove("B");
		System.out.println("Set after removing 'B': " + set);
	}
}