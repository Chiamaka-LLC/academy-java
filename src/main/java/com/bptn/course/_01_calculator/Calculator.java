package com.bptn.course._01_calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner	scan = new Scanner(System.in);	// import scanner to read user's input
		
		
		int userChoice;
		
		
		do {
		//Display the calculator menu
		System.out.println("Calculator Menu");
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for multiplication");
		System.out.println("Press 4 for division");
		System.out.println("Press 5 to square a number");
		System.out.println("Press 6 to find a square root");
		System.out.println("Press 7 to find the reciprocal");
		
		//Ask for user's input
		System.out.println("Enter your choice: ");
		userChoice = scan.nextInt();       //set user's input to integer
		
		//perform the user's specified operation
		switch (userChoice) {
		case 1:
		// Addition
            System.out.print("Enter the first number: ");
            double num1 = scan.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scan.nextDouble();
            System.out.println("The sum of the numbers " + num1 + " and " + num2 + " is = " + (num1 + num2));
            break;
			
		case 2:
			// Subtraction
			System.out.print("Enter the first number: ");
            num1 = scan.nextDouble();
            System.out.print("Enter the second number: ");
            num2 = scan.nextDouble();
            System.out.println("The difference of the numbers " + num1 + " and " + num2 + " is = " + (num1 - num2));
            break;
            
		case 3:
			// multiplication
			System.out.print("Enter the first number: ");
            num1 = scan.nextDouble();
            System.out.print("Enter the second number: ");
            num2 = scan.nextDouble();
            System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + (num1 * num2));
            break;
            
		case 4:
			// division
			System.out.print("Enter the first number: ");
            num1 = scan.nextDouble();
            System.out.print("Enter the second number: ");
            num2 = scan.nextDouble();
            System.out.println("Dividing " + num1 + " by " + num2 + " the quotient is " + (num1 / num2));
            System.out.println("The remainder is " + (num1 % num2));
            break;
            
		case 5:
            // Square of a number
            System.out.print("Enter the number to square: ");
            num1 = scan.nextDouble();
            System.out.println("The square of the number " + num1 + " is = " + (num1 * num1));
            break;
            
		case 6:
            // Square root
            System.out.print("Enter the first number: ");
            num1 = scan.nextDouble();
            if (num1 < 0) {
                System.out.println("Error: Cannot find the square root of a negative number!");
            } else {
                System.out.println("The square root of the number " + num1 + " is = " + Math.sqrt(num1));
            }
            break;
            
        case 7:
            // Reciprocal
            System.out.print("Enter the number to find the reciprocal: ");
            num1 = scan.nextDouble();
            if (num1 == 0) {
                System.out.println("Error: Cannot find the reciprocal of zero!");
            } else {
                System.out.println("The reciprocal of the number " + num1 + " is = " + (1 / num1));
            }
            break;
        default:
            // Invalid choice
            System.out.println("Invalid choice! Please make a valid choice.");
    }

    // Ask user if they want to continue or exit
    System.out.print("To continue calculation Press 1, else press any other number to exit: ");
    userChoice = scan.nextInt();

} while (userChoice == 1);  // The loop will repeat if the user enters 1

// Close the scanner
scan.close();
System.out.println("Program has exited. Goodbye!");
}

	}
		
