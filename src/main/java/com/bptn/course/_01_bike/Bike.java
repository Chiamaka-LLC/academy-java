package com.bptn.course._01_bike;

import com.bptn.course._01_vehicle.Vehicle;

public class Bike extends Vehicle {

	// Declare String bikeHandle
    private String bikeHandle;

    // Define a parameterized constructor
    public Bike(String color, String brand, String bikeHandle) {
        super(color, brand);  // Call the parent class constructor
        this.bikeHandle = bikeHandle;  // Initialize the bikeHandle variable
    }

    // Create a print() method
    public void print() {
        super.print();  // Call the parent class print method
        
    }
}

