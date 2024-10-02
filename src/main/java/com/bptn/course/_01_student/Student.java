package com.bptn.course._01_student;

public class Student {

	
		private String name;
		   private String email;
		   private int id;

		   public Student(String initName, String initEmail, int initId) {
		      name = initName;
		      email = initEmail;
		      id = initId;
		   }

		   // accessor methods - getters
		   /** getName()  @return name */
		   public String getName() {
		      return name;
		   }
		   /** getEmail()  @return email */
		   public String getEmail() {
		      return email;
		   }
		   /** getName()  @return id */
		   public int getId() {
		      return id;
		   }

				@Override
		    public String toString() {   
		    return id + ": " + name + ", " + email;
		}

			public static void main(String[] args) {
			 // Create a student with the required details
			 Student student = new Student("Skyler", "skyler@sky.com", 123456);
			System.out.println(student.toString()); // Output the student's details  
				
	}
}

