package com.bptn.course._junit_books;
public class Textbook extends Book {

	private int edition;
	// Define a constructor or Textbook that takes three parameters: a string title, a double price, and an int edition
	public Textbook(String title, double price, int edition) {
		super(title, price);
		this.edition = edition;

	}

	@Override
	public String getBookInfo() {
		// TODO Auto-generated method stub
		return super.getBookInfo() + "-" + edition;
	}
	// Getter for edition
	public int getEdition( ) {
		return edition;
	} 
	// Method to determine if this textbook can substitute for the other textbook
	public boolean canSubstituteFor(Textbook other) {
		return this.edition >= other.getEdition() && this.getTitle().equals(other.getTitle());
	}
}