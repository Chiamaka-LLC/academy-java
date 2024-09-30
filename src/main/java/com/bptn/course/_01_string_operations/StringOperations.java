package com.bptn.course._01_string_operations;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {

				Scanner	scan = new Scanner(System.in);	// import scanner to read user's input
				
				
				int userChoice = -1;  // Initialize userChoice with a value that will allow the loop to run
				
				
				do {
				
				//Display the program menu options
				System.out.println("…String Menu…");
				System.out.println("Press 1 for Palindrome Check");
				System.out.println("Press 2 to reverse a String");
				System.out.println("Press 3 Concatenate two Strings");
				System.out.println("Press 4 for String Comparison");
				System.out.println("Press 5 to Calculate the Length of String");
				System.out.println("Press 6 to Exit");
				
				//Ask for user's input, and check if the input is an integer
				System.out.println("Enter your choice: ");
	            if (scan.hasNextInt()) {
	                userChoice = scan.nextInt();  // Set user's input to an integer
	                scan.nextLine();  // Clear the input buffer of any extra newline characters
	            } else {
	                // If the input is not an integer, get the invalid input and display an error message
	                String invalidChoice = scan.next();  // Read the invalid input as a string
	                System.out.println("Invalid choice '" + invalidChoice + "'! Please enter a valid number.");
	                continue;  // Restart the loop and prompt the user again
	            }
							
				
				
				//perform the user's specified operation
				switch (userChoice) {
				case 1:
					// Palindrome Check
					
					 System.out.println("Palindrome Check");
	                 System.out.print("Enter a string: ");
	                 String stringOperation = scan.nextLine();  // Get the string input from the user
	                
					String reverseInput = "";     // Initialize a string to store the reversed input
			        
					// Reverse the string using a for loop
					for (int i = stringOperation.length() - 1; i >= 0; i--) {
			            reverseInput += stringOperation.charAt(i);
			        }
					
					// Compare the original and reversed string (case-insensitive)
			        if (stringOperation.toLowerCase().equals(reverseInput.toLowerCase())) {
			            System.out.println(stringOperation + " is a palindrome");
			        } else {
			            System.out.println(stringOperation + " is not palindrome");
	} 
			        break;
			        

			     case 2:
	                    // Reverse a String
	                    System.out.println("Reverse a String");
	                    System.out.print("Enter a string: ");
	                    String inputString = scan.nextLine();
	                    String reversedString = "";

	                    // Reverse the string
	                    for (int i = inputString.length() - 1; i >= 0; i--) {
	                        reversedString += inputString.charAt(i);
	                    }
	                    System.out.println("Reversed string: " + reversedString);
	                    break;

	                case 3:
	                    // Concatenate two Strings
	                    System.out.println("Concatenate two Strings");
	                    System.out.print("Enter the first string: ");
	                    String firstString = scan.nextLine();
	                    System.out.print("Enter the second string: ");
	                    String secondString = scan.nextLine();
	                    System.out.println("Concatenated string: " + firstString + secondString);
	                    break;

	                case 4:
	                    // String Comparison
	                    System.out.println("String Comparison");
	                    System.out.print("Enter the first string: ");
	                    String firstCompareString = scan.nextLine();
	                    System.out.print("Enter the second string: ");
	                    String secondCompareString = scan.nextLine();

	                    if (firstCompareString.equals(secondCompareString)) {
	                        System.out.println("The entered strings are equal");
	                    } else {
	                        System.out.println("The entered strings are not equal");
	                    }
	                    break;

	                case 5:
	                    // Calculate the Length of a String
	                    System.out.println("Calculate the Length of a String");
	                    System.out.print("Enter a string: ");
	                    String lengthString = scan.nextLine();
	                    System.out.println("The length of the entered string is: " + lengthString.length());
	                    break;

	                case 6:
	                    // Exit the program
	                    System.out.println("Exiting the program...");
	                    break;

	                default:
	                    // Handle invalid choice
	                    System.out.println("Invalid choice! Please make a valid choice.");
	            }

	        } while (userChoice != 6);  // Continue looping until the user chooses to exit
	        
	        scan.close();  // Close the scanner
	    }
}
/*
Summary
This program prompts the user for different string operations (like palindrome check, reversal, concatenation, etc.), 
processes the user's choice, and performs the corresponding operation.
The loop will continue until the user select option 6.
Some of the struggles I faced was making sure the Palindrome option was not case-sensitive.
Moving forward, I would use switch cases for menu items. This will ensure that only the specified user's operation is executed.
*/