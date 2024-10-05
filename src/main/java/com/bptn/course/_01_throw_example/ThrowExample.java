package com.bptn.course._01_throw_example;

public class ThrowExample {

	public static void main(String[] args) {
		 try {
	            // Attempting to set age to a negative value, which is invalid
	            setAge(19);
	        } catch (IllegalArgumentException e) {
	            // Catching the exception and printing an error message
	            System.out.println("Exception caught: " + e.getMessage());
	        }

	        System.out.println("End of program.");
	    }

	    // Method to set the age, throws an exception if the age is invalid
	    public static void setAge(int age) {
	        if (age < 18) {
	            // Throwing an IllegalArgumentException with a custom message
	            throw new IllegalArgumentException("Age cannot be negative.");
	        } else {
	            System.out.println("Age is set to: " + age);
	        }
	    }
	}