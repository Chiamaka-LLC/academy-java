package com.bptn.course._01_plural_form;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		  int amt = 0; // Initialize amt

	        // Loop until a valid integer input is received
	        while (true) {
	            try {
	                // Prompt the user to enter a non-negative integer
	                System.out.print("Enter a non-negative integer: ");
	                amt = scan.nextInt(); // Read the integer input

	                // Check if the input is a non-negative integer
	                if (amt < 0) {
	                    System.out.println("Please enter a non-negative integer.");
	                    continue; // Ask for input again
	                }
	                break; // Break the loop if input is valid
	            } catch (InputMismatchException e) {
	                System.out.println("Invalid input. Please enter a valid non-negative integer.");
	                scan.next(); // Clear the invalid input
	            }
	        }

	        // Prompt the user to enter a singular noun
	        System.out.print("Enter a singular noun: ");
	        String word = scan.next(); // Read the string input

	        // Call the pluralize method to get the plural form of the word
	        String pluralWord = pluralize(amt, word);
	        
	        // Print the result in the format "<amount> <pluralized word>"
	        System.out.println(pluralWord);
	        
	        scan.close(); // Close the scanner to avoid resource leaks
	    }

	    public static String pluralize(int amt, String word) {
	        // Check if the amount is 1
	        if (amt == 1) {
	            // Return the singular form as it is
	            return amt + " " + word;
	        }

	        // Apply pluralization rules based on the ending of the word
	        // Rule for words ending in "fe"
	        if (word.endsWith("fe")) {
	            // Replace 'fe' with 'ves'
	            word = word.substring(0, word.length() - 2) + "ves"; 
	        }
	        // Rule for words ending in "y"
	        else if (word.endsWith("y") && !(word.endsWith("ay") || word.endsWith("ey") || word.endsWith("oy") || word.endsWith("uy"))) {
	            // Replace 'y' with 'ies' if it doesn't follow a vowel
	            word = word.substring(0, word.length() - 1) + "ies"; 
	        }
	        // Rule for words ending in "sh" or "ch"
	        else if (word.endsWith("sh") || word.endsWith("ch")) {
	            // Add 'es' to the end
	            word += "es"; 
	        }
	        // Rule for words ending in "us"
	        else if (word.endsWith("us")) {
	            // Replace 'us' with 'i'
	            word = word.substring(0, word.length() - 2) + "i"; 
	        }
	        // Rule for words ending in "ay", "oy", "ey", or "uy"
	        else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
	            // Just add 's' to the end
	            word += "s"; 
	        } else {
	            // For all other cases, simply add 's' to pluralize
	            word += "s"; 
	        }

	        // Return the formatted output with the pluralized word
	        return amt + " " + word;
	    }
}
/*
Summary:
This program is designed to take a non-negative integer and a singular noun as input and print the noun in its plural form according to specific English rules. 
I learned how to implement input validation using a try-catch block to handle exceptions, ensuring graceful exits when invalid input is provided.
I initially struggled with how to handle non-integer input without crashing the program. Using exception handling resolved this issue.
I will remember to implement input validation in my programs to ensure robustness, especially when dealing with user input.
*/