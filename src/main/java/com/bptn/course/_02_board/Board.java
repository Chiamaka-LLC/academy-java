package com.bptn.course._02_board;
import java.util.Arrays;
import java.util.Scanner;

public class Board {
	// add instance variables
	private String[][] board;

	// Board setup method
	public void boardSetUp() {
		Scanner scan = new Scanner(System.in);
		System.out.println("------ Board Set up -------");
		System.out.println("Number of rows: ");

		int rows = scan.nextInt();		// receive user input for rows
		System.out.println("Number of cols: ");
		// receive column value
		int cols = scan.nextInt();		// receive user input for columns


		this.board = new String[rows][cols];  // initialize a row by column array;

		// initialize empty board with dashes (-)
		for (String[] row : board) {
			Arrays.fill(row, "-");  // fill up each row of the board with dashes
		}
	}

	public void printBoard() {
		for (String[] row : board) {
			System.out.println(Arrays.toString(row));
		}
	}

	public boolean columnFull(int col) {
		return !board[0][col].equals("-"); // Returns true if the column is full
	}

	public boolean boardFull() {
		// True understanding this code.
		for (int i = 0; i < this.board[0].length; i++) {
			if (!columnFull(i)) {
				return false;
			}
		}
		return true;		// Board is full
	}

	// Add a token to the board in the specified column
	public boolean addToken(int colToAddToken, String token) {			
		if (colToAddToken < 0 || colToAddToken >= board[0].length) {
			return false; // Invalid column
		}

		for (int rowToAddToken = board.length - 1; rowToAddToken >= 0; rowToAddToken--) {
			if (board[rowToAddToken][colToAddToken].equals("-")) {
				// Place the token and return true
				board[rowToAddToken][colToAddToken] = token;
				return true;
			}
		}
		return false; // Column is full

	}

	public boolean checkIfPlayerIsTheWinner(String playerNumber) {
		return checkHorizontal(playerNumber) || checkVertical(playerNumber) || checkLeftDiagonal(playerNumber) || checkRightDiagonal(playerNumber);
	}

	public boolean checkVertical(String playerNumber) {
		for (int col = 0; col < board[0].length; col++) {
			// length - 3 here because we are comparing 4 in a row items
			for (int row = 0; row < board.length - 3; row++) {
				if (board[row][col].equals(playerNumber) &&
						board[row + 1][col].equals(playerNumber) &&
						board[row + 2][col].equals(playerNumber) &&
						board[row + 3][col].equals(playerNumber)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean checkHorizontal(String playerNumber) {
		for (int row = 0; row < board.length; row++) {
			// try implementing this by being inspired by the checkVertical logic. Note avoid off by 1 errors. Also remember that you are now checking across columns within each row this time. 
			for (int col = 0; col < board[0].length - 3; col++) {
				if (board[row][col].equals(playerNumber) &&
						board[row][col + 1].equals(playerNumber) &&
						board[row][col + 2].equals(playerNumber) &&
						board[row][col + 3].equals(playerNumber)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean checkLeftDiagonal(String playerNumber) {
		for (int row = 0; row < board.length - 3; row++) {
			for (int col = 0; col < board[0].length - 3; col++) {
				if (board[row][col].equals(playerNumber) &&
						board[row + 1][col + 1].equals(playerNumber) &&
						board[row + 2][col + 2].equals(playerNumber) &&
						board[row + 3][col + 3].equals(playerNumber)) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean checkRightDiagonal(String playerNumber) {
		for (int row = 0; row < board.length - 3; row++) {
			for (int col = 3; col < board[0].length; col++) {
				if (board[row][col].equals(playerNumber) &&
						board[row + 1][col - 1].equals(playerNumber) &&
						board[row + 2][col - 2].equals(playerNumber) &&
						board[row + 3][col - 3].equals(playerNumber)) {
					return true;
				}
			}
		}
		return false;
	}

	public int getColumns() {
		return board[0].length;
	}

	public boolean addToken(int col, int playerNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean checkIfPlayerIsTheWinner(int playerNumber) {
		// TODO Auto-generated method stub
		return false;
	}
}

/*
// TODO: Uncomment this to test your board class in isolation. 
// This is just a small set of tests for our board class for now. We will
// delete this when we have the TestClass and Game class created.
// We should have only one "main" method in the program at the end of the entire
// challenge otherwise Java will freak out if there are multiple main classes in
// the different classes it looks into.
// A main method acts as the Java entry point into your program and Java expects
// only one entry point.

//Uncomment below to see if you've done the job:
public static void main(String[] args) {
	Board board1 = new Board();
	board1.boardSetUp();
	board1.printBoard();

	board1.addToken(0, "x");
	board1.addToken(0, "x");
	board1.addToken(0, "x");
	board1.addToken(1, "y");
	board1.addToken(1, "z");
	board1.addToken(1, "w");
	board1.addToken(0, "x");

	System.out.println("Board for testing checkVertical");
	System.out.println("Board 1 check vertical with x returns -> " + board1.checkVertical("x"));
	System.out.println("Board 1 check vertical with y returns -> " + board1.checkVertical("y"));

	board1.printBoard();

	Board board2 = new Board();
	// Test with at least a 4-by-4 size board.
	board2.boardSetUp();
	board2.printBoard();

	board2.addToken(0, "x");
	board2.addToken(0, "x");
	board2.addToken(0, "w");
	board2.addToken(0, "w");
	board2.addToken(1, "y");
	board2.addToken(1, "x");
	board2.addToken(1, "w");
	board2.addToken(2, "y");
	board2.addToken(2, "w");
	board2.addToken(2, "x");
	board2.addToken(3, "w");
	board2.addToken(3, "w");
	board2.addToken(3, "w");
	board2.addToken(3, "x");

	System.out.println("Board for testing diagonals");
	System.out.println("Board 2 check right diagonal with x returns -> " + board2.checkRightDiagonal("x"));
	System.out.println("Board 2 check right diagonal y returns -> " + board2.checkRightDiagonal("y"));
	System.out.println("Board 2 check left diagonal w returns -> " + board2.checkLeftDiagonal("w"));

	board2.printBoard();
}

 */


