package com.bptn.course._01_big_coding._oct_11;

public class OutOfStockException extends Exception {

	

	private String message;
	public OutOfStockException(String message) {
		super(message);
		this.message = message;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
