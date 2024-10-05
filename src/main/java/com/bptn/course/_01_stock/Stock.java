package com.bptn.course._01_stock;

public class Stock {
    // Create instance variables 
	
	private String tickerSymbol;
	private String companyName;
	private int price;
	private double percentChange;
	private int totalShares;
	private long marketCap;
	
	
    // Constructor 
    
	
	 public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
	        this.tickerSymbol = tickerSymbol.toUpperCase();  // Convert to uppercase 
	        this.companyName = companyName;
	        this.price = price;
	        this.totalShares = totalShares;
	        this.percentChange = 0.0;
	        this.marketCap = totalShares * price;
	 }
	    // Method to adjust the price and recalculate percentChange and marketCap
	    public void adjustPrice(int change) {
	        double oldPrice = this.price; // Store the old price
	        this.price += change; // Change the price

	        // Calculate percentChange
	        this.percentChange = ((double) change / price) * 100;

	        // Recalculate marketCap
	        this.marketCap = totalShares * this.price; // Calculate and assign marketCap
	    }

	    // toString method to return a string representation of the Stock object
	    @Override
	    public String toString() {
	        // Check if the percentChange is 0, then format to one decimal place, else format to ten decimal places
	        String formattedPercentChange;
	        if (percentChange == 0.0) {
	            formattedPercentChange = String.format("%.1f", percentChange); // One decimal place for the initial output
	        } else {
	            formattedPercentChange = String.format("%.16f", percentChange); // Ten decimal places for the subsequent output
	        }

	        // Format marketCap with commas
	        

	        return "Ticker Symbol: " + tickerSymbol + "\n" +
	               "Company: " + companyName + "\n" +
	               "Current Price: $" + price + " (" + formattedPercentChange + "%)\n" +
	               "Market Cap: $" + marketCap;
	    }
	 
    // Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
}
/*Summary
This program creates a Stock class that stores information about a company’s stock, formats it, 
and prints it to the console.
One challenge I encountered was correctly calculating and formatting the percentage change in price without excessive decimal precision. 
Moving forward, I’ll focus on handling numerical precision and improving method organization in similar projects, ensuring clearer and more efficient code.
*/

