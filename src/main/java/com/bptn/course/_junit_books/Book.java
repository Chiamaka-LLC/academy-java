package com.bptn.course._junit_books;
public class Book {
	
	//define two private instance variables: title and price
   private String title;
   private double price;
   // Define a constructor within the Book class that takes two parameters: title and price
   public Book(String title, double price) {
	   this.title = title;
	   this.price = price;
   }
	//Define a getter method named getTitle that returns the value of the title
	public String getTitle( ) {
	return title;
	} 
	// Method to combine title and price into a single string
    public String getBookInfo() {
        return title + "-" + price;
    }
	
	
}
