package com.bptn.course._01_nested_try_catch_example;

public class NestedTryCatchExample {

	public static void main(String[] args) {
		try {
            // Outer try block
            int[] numbers = {1, 2, 3, 4};

            try {
                // Inner try block
                // Trying to access an index that's out of bounds
                System.out.println(numbers[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handling ArrayIndexOutOfBoundsException
                System.out.println("Array index is out of bounds!");
            }

            // Performing a division by zero, which will trigger an ArithmeticException
            int result = 10 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            // Handling ArithmeticException
            System.out.println("Cannot divide by zero!");
        }

        System.out.println("End of program.");
    }
}

/*Summary
The outer try block checks for arithmetic exceptions.
The inner try block checks for array index out-of-bounds exceptions.
The program catches both exceptions separately and continues running after handling both errors.*/