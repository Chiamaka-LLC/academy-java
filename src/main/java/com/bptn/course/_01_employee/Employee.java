package com.bptn.course._01_employee;

public class Employee {

		private int id;

		   public Employee(String theName, int id) {
		      super(theName);
		      this.id = id;
		
			}
		   public int getId() {
		      return id;
		   }

		   public static void main(String[] args) {
		      
		      Employee emp = new Employee("Dani", 10);

		      //use the getter methods and print the name & id of the emp object
		      System.out.println(emp.getName()); // prints the name
		      System.out.println(emp.getId());   // prints the id
		   
		   }

	}

}
