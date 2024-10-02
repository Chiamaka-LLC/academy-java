package com.bptn.course._02_player;

import java.util.Scanner;

public class Player {
	
	
		//Instance variables
		private String name;
		private int playerNumber;

		Player(){
		}
		public Player(String name, int playerNumber) {
		this.name = name;
		this.playerNumber = playerNumber;

		}
		public String getName() {
		return name;
		}

		public int getPlayerNumber() {
		return playerNumber;
		}

		public int makeMove(int m) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Slect a column for your token");
		int column;
		
		// Loop until a valid column is entered (assuming m is the number of columns.)
	    while (true) {
	        System.out.println(name + " (Player " + playerNumber + "), enter the column number where you want to drop your token (1-" + m + ")");
	        column = scan.nextInt();

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
	    public static void main(String[] args) {
	        // Create a player object
	        Player player1 = new Player("Bayo", 1);
	        
	     // Assume 7 columns (for example)
	        int m = 7;
	        int chosenColumn = player1.makeMove(m);  // Prompt the player to make a move
	        
	        System.out.println("Player chose column: " + chosenColumn);
	    }
	}