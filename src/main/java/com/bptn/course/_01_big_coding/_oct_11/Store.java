package com.bptn.course._01_big_coding._oct_11;
import java.util.HashMap;
import java.util.Map;
public class Store {

	
	private Map<String, Integer> products;
	
	//No-argument constructor to initialize the products with default values
	public Store() {
	products = new HashMap<>();	 
    products.put("apple", 10);
    products.put("banana", 5);
    products.put("orange", 0);
	}
    
    
    public void purchase(String product, int quantity) throws OutOfStockException {
        // Check if the product is available in the store. Hint: Use the map
        if (products.containsKey(product)){
            // If not, throw an OutOfStockException with a message indicating the product is not available.
        }else {
        	throw new OutOfStockException("Product " + product + " not available in store");
        }
    
        // Check if there is enough stock for the desired quantity. Hint: Use the map
    int availableQuantity = products.get(product);
        if (quantity > availableQuantity){
            // If not, throw an OutOfStockException with a message indicating the product is out of stock.    
        	 throw new OutOfStockException("Product " + product + " out of stock");
        }
    
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	}

