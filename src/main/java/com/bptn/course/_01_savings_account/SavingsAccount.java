package com.bptn.course._01_savings_account;

import com.bptn.course._01_account.Account;

public class SavingsAccount extends Account{

	   //declare instance variable
	private double interest;

    //add parameterized constructor - use super keyword to call parent constructor
	 public SavingsAccount(String name, double balance, double interestRate) {
	        super(name, balance); // Call the Account constructor
	        this.interest = interest; // Set the interest rate
	    }
	 
	 
    //override the toString method
	 
	    @Override
	    public String toString() {
	        return super.toString() + ", " + interest; // Call superclass toString and add interest rate
	    }
    //override the equals method
	    @Override
	    public boolean equals(Object obj) {
	        if (!(obj instanceof SavingsAccount)) {
	            return false; // Check if obj is an instance of SavingsAccount
	        }
	        SavingsAccount other = (SavingsAccount) obj; // Cast to SavingsAccount
	        // Call superclass equals method and check interest rates
	        return super.equals(other) && this.interest == other.interest;
	}

}
