package com.bptn.course._02_car;

import com.bptn.course._01_vehicle.Vehicle;

public class Car extends Vehicle {
	 //instance variable 
	   String steeringWheel;
	   
	   
	  //add parameterized constructor- use super keyword to call parent constructor
	public Car(String colour, String brand, String steeringWheel) {
		//use super keyword to call parent constructor
		super(colour, brand);
	
		 this.steeringWheel = steeringWheel;
	}

}
