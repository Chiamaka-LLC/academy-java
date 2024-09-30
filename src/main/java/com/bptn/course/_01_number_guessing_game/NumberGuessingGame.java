package com.bptn.course._01_number_guessing_game;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
        int targetNumber = 23; // Generates a number between 1 and 100

        // Create a Scanner object to take input from the user
        Scanner scan = new Scanner(System.in);
        int guess = 0;
     

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        // Game loop: Keep asking the user until they guess correctly
        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scan.nextInt(); // Get user's guess
        

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly!");
            }
        }

        // Close the scanner
        scan.close();


	}

}
