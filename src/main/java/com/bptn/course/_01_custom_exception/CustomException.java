package com.bptn.course._01_custom_exception;

import java.util.Scanner;

import com.bptn.course._01_file_extension_exception.FileExtensionException;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		// Prompt user to enter a file name with correct extension
		System.out.println("Enter the file name with correct extension i.e. .txt");
		String fileName = scan.nextLine();
		
	try {
	 
	            // Call validateFileExtension to check if the file name is valid
	            validateFileExtension(fileName);

	            // If no exception is thrown, print success message
	            System.out.println("Correct file name with extension .txt");

	        } catch (FileExtensionException e) {
	            // If an exception is caught, print the error message
	            System.out.println("Error: " + e.getMessage());

	        } finally {
	            // Close the scanner instance in the finally block
	            if (scan != null) {
	                scan.close();
	                System.out.println("Scanner closed.");
	            }
	        }
	    }

	private static void validateFileExtension(String fileName) throws FileExtensionException {
		
		  // Check if the file name ends with .txt
        if (!fileName.endsWith(".txt")) {
            // Throw custom exception if file extension is not .txt
            throw new FileExtensionException("File doesn't have .txt extension.");
	}
	}
	}
	
/* Summary
 * This program demonstrates custom exception handling by validating file names to ensure they end with a .txt extension.
 * The program includes a custom exception class named FileExtensionException, which is used to provide meaningful error messages when an invalid file name is entered.
 * This class also extends the built-in Exception class and it includes features a parameterized constructor that allows users to provide a custom error message.
 * I gained a deeper understanding of the try-catch-finally structure in Java.
 * 
 * Some challenges I faced was creating a design flow of the program to ensure that exceptions were caught and handled appropriately.
 * Also, debugging the program to ensure that exceptions were correctly thrown and caught took me a while.
 * In the future, I will continue to use custom exceptions in future applications to enhance error handling and make the code more readable.
 */

