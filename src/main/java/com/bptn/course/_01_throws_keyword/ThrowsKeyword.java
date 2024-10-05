package com.bptn.course._01_throws_keyword;

public class ThrowsKeyword {


		    // Method declares that it throws ArithmeticException
	 public static int divide(int a, int b) throws ArithmeticException {
	        if (b == 0) {
	            throw new ArithmeticException("Division by zero is not allowed.");
	        } else {
	            return a / b;
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            int result = divide(10, 0);  // This will trigger the ArithmeticException
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Caught an exception: " + e.getMessage());
	        }
	    }
	}

