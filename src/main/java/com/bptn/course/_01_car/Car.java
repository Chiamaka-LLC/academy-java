package com.bptn.course._01_car;

import com.bptn.course._01_vehicle.Vehicle;

public class Car extends Vehicle  {
	// Step 2a: Declare String steeringWheel
    private String steeringWheel;

    // Step 2b: Define a parameterized constructor
    public Car(String color, String brand, String steeringWheel) {
        super(color, brand);  // Call the parent class constructor
        this.steeringWheel = steeringWheel;  // Initialize the steeringWheel variable
    }

    // Step 2c: Create a print() method
    public void print() {
        super.print();  // Call the parent class print method
      
        @Override
        public void print() {
            System.out.println("I am Bike");
        }
    }
}
