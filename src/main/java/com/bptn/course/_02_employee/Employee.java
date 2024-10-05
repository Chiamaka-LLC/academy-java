package com.bptn.course._02_employee;

public class Employee {
	
	   // Instance variable to store salary
	  private int salary;
	   
	   // Instance variable to store hours per day worked by employee
	  private int hoursPerDay; 

	   // Constructor to set instance variables(salary and hoursPerDay) value 
		  public Employee(int salary, int hoursPerDay) {
		        setSalary(salary);
		        setHoursPerDay(hoursPerDay);
		  }
	   // Set method to update salary
		        public void setSalary(int salary) {
		            if (salary < 500) {
		                this.salary = salary + 10;
		            } else {
		                this.salary = salary;
		            }
		        }
	   // Set method to update hoursPerDay
	   
		        public void setHoursPerDay(int hoursPerDay) {
		            if (hoursPerDay > 6) {
		                this.salary = salary + 5;
		            } else {
		                this.hoursPerDay = hoursPerDay;
		            }
		        }
	   // Get method to return salary
		        public int getSalary() {
		            return this.salary;
	}


			
		

	public static void main(String[] args) {
	
		       // create an instance of Employee class and initialize it with salary = 100 and hoursPerDay = 8
		       Employee student = new Employee(100, 8);
		       
		       // print the salary of the employee
		       System.out.println(student.getSalary());
		   }
		}

/*Summary
This is a program to create an Employee class with the salary and hoursPerDay methods.
Some of the challenges I faced was setting up the getters and setters method. Going forward, I will 
continue to practice the getter and setter encapsulation techniques.
*/

