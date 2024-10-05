package com.bptn.course._02_person;

public class Person {
	
	// Create instance variables
	  private String firstName;
		private String lastName;
		private int birthMonth;
		private int birthDay; 
		private int birthYear;
		private String ssn;
		


	    // Constructor
	  public Person(String firstName, String lastName, int birthMonth, int birthDay, int birthYear, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.birthYear = birthYear;
		this.ssn = ssn;
		
		}
	    // Create methods
		public String getFirstName() {			//Returns the first name of the person
	        return firstName;
	}
		public String getlastName() {			//Returns the last name of the person
	        return lastName;
	}
		
		// Setter for firstName
		   public void setFirstName(String firstName) {			
		        this.firstName = firstName;
	}
		// Setter for lastName
		    public void setLastName(String lastName) {		
		        this.lastName = lastName;
		    }

		    
		  //Returns a string representing the person’s birthday in the format “birthMonth/birthDay/birthYear”
		    public String getBirthday() {						
		        return birthMonth + "/" + birthDay + "/" + birthYear;				
		    
		    }
		    public boolean verifySSN(String ssn) {     //Takes in a string parameter (ssn) and returns a boolean indicating whether it matches the person’s ssn or not.
		        return this.ssn.equals(ssn);
		    } 

	    //Dont modify the code below:
		    public static void main(String[] args) {
		            Person person1 = new Person("John", "Doe", 1, 1, 1990, "123-45-6789");
		            Person person2 = new Person("Jane", "Doe", 2, 2, 1991, "987-65-4321");
		            Person person3 = new Person("Jane", "Smith", 1, 1, 1990, "111-11-1111");
		            Person person4 = new Person("Jane", "Smith", 2, 2, 1991, "222-22-2222");
		            
		            System.out.println("Person 1: " + person1.getFirstName() + " " + person1.getlastName() + " Birthday: " + person1.getBirthday() + " SSN: " + person1.verifySSN("123-45-6789"));
		            System.out.println("Person 2: " + person2.getFirstName() + " " + person2.getlastName() + " Birthday: " + person2.getBirthday() + " SSN: " + person2.verifySSN("987-65-4321"));
		            System.out.println("Person 3: " + person3.getFirstName() + " " + person3.getlastName() + " Birthday: " + person3.getBirthday() + " SSN: " + person3.verifySSN("111-11-1111"));
		            System.out.println("Person 4: " + person4.getFirstName() + " " + person4.getlastName() + " Birthday: " + person4.getBirthday() + " SSN: " + person4.verifySSN("222-22-2222"));
		        }
	}
/*Summary
This program defines a Person class with private instance variables for name, birth date, and SSN. It includes methods to get and set names, format a birthday, and verify SSN. 
The main method creates multiple Person objects and tests all functionalities.
Implementing the verifySSN method to compare strings was new to me. Also, Ensuring the getBirthday method returned the correct format was a bit tricky at first.
Moving forward, I'll apply better planning for string formatting and testing methods to avoid errors in future projects.
*/	
