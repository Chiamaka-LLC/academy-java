package com.bptn.course._02_player;

import java.util.Scanner;

public class Player {


	//Instance variables
	private String name;
	private int playerNumber;
	private static Scanner scan = new Scanner(System.in); // Use static scanner to avoid multiple instances

	// Constructor
	public Player(String name, String playerNumber) {
		this.name = name;
		this.playerNumber = Integer.parseInt(playerNumber);


	}
	public String getName() {
		return name;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public int makeMove(int columns) {

		int column;

		// Loop until a valid column is entered (assuming m is the number of columns.)
		while (true) {
			System.out.println(name + " (Player " + playerNumber + "), enter the column number where you want to drop your token (1-" + columns + ")");
			column = scan.nextInt();

			int m = 7;
			// Validate if the input is within the valid range (1 to m)
			if (column >= 1 && column <= m) {
				break;  // Valid input, exit loop
			} else {
				System.out.println("Invalid input. Please enter a column between 1 and 7.");
			}
		}
		return column;
	}
	// toString method to return player info in the desired format
	@Override
	public String toString() {
		return "Player " + playerNumber + " is " + name;


	}
}