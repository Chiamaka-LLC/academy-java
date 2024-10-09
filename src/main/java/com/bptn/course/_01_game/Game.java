package com.bptn.course._01_game;

import java.util.Scanner;

import com.bptn.course._02_board.Board;
import com.bptn.course._02_player.Player;
import com.bptn.course._02_board.Board;
import com.bptn.course._02_player.Player;
public class Game {


	    private Player[] players;
	    private Board board;
	    private static Scanner scanner = new Scanner(System.in);

	    // Implement the constructor method for the Game class, which will initialize the players and board variables.
	    public Game() {
	        // Initialize the players array for two Player objects
	        this.players = new Player[2]; // Corrected line
	        this.board = new Board(); // Corrected line (use 'Board' with uppercase 'B')
	    }

	    // Implement the setUpGame method, which will be responsible for getting the names of the two players and setting up the game board.
	    public void setUpGame() {
	        System.out.println("Enter player 1's name: ");
	        players[0] = new Player(scanner.nextLine(), "1");
	        String playerTwoName;

	        // Ensure the second player's name is different from the first
	        do {
	            System.out.println("Enter player 2's name: ");
	            playerTwoName = scanner.nextLine();
	            if (playerTwoName.equals(players[0].getName())) {
	                System.out.println("Error! Both players cannot have the same name.");
	            }
	        } while (playerTwoName.equals(players[0].getName()));

	        players[1] = new Player(playerTwoName, "2");

	        // Set up the board using the appropriate method
	        board.boardSetUp(); // Assumes this method exists in the Board class
	        // Print the board using the appropriate method
	        board.printBoard(); // Assumes this method exists in the Board class
	    }

	    public void printWinner(Player player) {
	        System.out.println(player.getName() + " is the winner!");
	    }

	    public void playerTurn(Player currentPlayer) {
	        int col;
	        do {
	        	 col = currentPlayer.makeMove(board.getColumns()) -1; // Pass the number of columns
	             if (col < 0 || col >= board.getColumns()) {
	                 System.out.println("Invalid column. Please enter a column between 0 and " + (board.getColumns() - 1));
	             }
	         } while (!board.addToken(col, currentPlayer.getPlayerNumber())); // Check if the move is valid

	         // Print the board after a successful move
	         board.printBoard();
	     }

	    public void play() {
	        boolean noWinner = true;
	        this.setUpGame();
	        int currentPlayerIndex = 0;

	        while (noWinner) {
	            if (board.boardFull()) { // Check if the board is full
	                System.out.println("Board is now full. Game Ends.");
	                return;
	            }

	            Player currentPlayer = players[currentPlayerIndex];
	            System.out.println("It is player " + currentPlayer.getPlayerNumber() + "'s turn: " + currentPlayer);
	            playerTurn(currentPlayer);
	            if (board.checkIfPlayerIsTheWinner(currentPlayer.getPlayerNumber())) { // Assumes this method exists in the Board class
	                printWinner(currentPlayer);
	                noWinner = false; // End the loop if there's a winner
	            } else {
	                // Switch players
	                currentPlayerIndex = (currentPlayerIndex + 1) % players.length; // Wraps back to the first player
	            }
	        }
	    }
	}
