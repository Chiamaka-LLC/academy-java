package com.bptn.course._02_big_coding_oct_21;

import java.util.ArrayList;
import java.util.List;

public class Product {
	// Create your instance variables
	int id;
	String name;
	double price;
	
    // Create a constructor to initialize the product properties
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
    // Create a static method "countProducts"
    public static long countProducts (List<Product> products, double priceLimit) {
		
    // Filter products based on the price and get the count of products
    	 return products.stream() // Get a stream of Product objects
    			 .filter(product -> product.price < priceLimit) // Filter products by price
                 .count(); // Count the filtered products
     }
    			 
    			 
    public static void main(String[] args) {
        // Create a list of products
        List<Product> productsList = new ArrayList<>();

        // Add products to the list
        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2, "Dell Laptop", 30000));
        productsList.add(new Product(3, "Lenevo Laptop", 28000));
        productsList.add(new Product(4, "Sony Laptop", 28000));
        productsList.add(new Product(5, "Apple Laptop", 90000));

        // Call "countProducts" method and hold return type in "count" variable 
        long count = Product.countProducts(productsList, 30000);

        // Print the count of products whose price is less than 30000
        System.out.println("Number of products with price less than 30000: " + count);
    }
}
/*
Summary:
This task introduced me to using Java Streams for data processing. 
I learned how to filter and count items in a collection efficiently. 
I initially faced some challenges with understanding stream operations but resolved them through practice. 
In the future, I will remember to utilize Streams for cleaner and more concise code when handling collections.
*/