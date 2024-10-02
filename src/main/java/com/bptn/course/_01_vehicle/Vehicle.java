package com.bptn.course._01_vehicle;

public class Vehicle {
	
	// Step 1a: Declare String color and String brand
	 private String color;
	 private String brand;
	
	 // Step 1b: Define a parameterized constructor with color and brand as parameters
	 public Vehicle(String color, String brand) {
	        this.color = color;  // Initialize the color variable
	        this.brand = brand;  // Initialize the brand variable
	 }       
	 //Create a print() method        
	 public void print() {  
		   System.out.println(this.color + " " + this.brand); 
		

	}

}
