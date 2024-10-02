package com.bptn.course._01_Add;

public class Add {


		 // Method that accepts two integers and returns their sum
	    public int add(int a, int b) {
	        return a + b;
	    }

	    // Method that accepts three integers and returns their sum
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    // Method that accepts two doubles and returns their sum
	    public double add(double a, double b) {
	        return a + b;
	    }

	    // Do not modify the code below.
	    public static void main(String args[]) {
	        Add obj = new Add();
	        System.out.println(obj.add(12, 21));            // Outputs: 33
	        System.out.println(obj.add(11, 23, 10));         // Outputs: 44
	        System.out.println(obj.add(100.10, 200.5));      // Outputs: 300.6
	    }
	}

   /*Summary
    * In this task, I implemented an Add class that uses method 
    * overloading to provide multiple ways to add numbers: two integers, three integers, and two doubles. 
    * One new aspect of this task was the use of method overloading. 
    * It was interesting to see how multiple methods with the same name can coexist in a class as long as they have different parameter lists.
    * Initially, I needed to remember to maintain consistent return types across different method overloads, which can sometimes lead to confusion.
    * From this lesson, I will make sure to remember the importance of method overloading in Java, 
    * especially when designing classes that perform similar operations but with different types or counts of input
    */
