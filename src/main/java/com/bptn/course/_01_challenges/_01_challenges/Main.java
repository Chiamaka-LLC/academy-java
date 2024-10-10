package com.bptn.course._01_challenges._01_challenges;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		        // Start by looking in the University and Student classes. Implement the methods. 

		        // Create a bunch of student objects 
		            // (Make sure one student has the following studentId: 123)
		            // (Make sure one other student has the following username: testUsername1)

		        Student student1 = new Student(123, "janeSmith", "password1", "Jane", "Smith", "jane.smith@university.com", "123456789", "apple street", "Female", new Date(), new Date(), 111, "CS" );
				Student student2 = new Student(124, "testUsername1", "password2", "Test", "Username1", "test.userName1@university.com", "0123456789", "orange street", "Female", new Date(), new Date(), 113, "CS" );
				Student student3 = new Student(125, "tayoSmarty", "password3", "Tayo", "Smarty", "tayo.smarty@university.com", "2345678901", "kiwi street", "Male", new Date(), new Date(), 115, "CS" );
				
		        // Create instance of university called "university" and populate it with the students.
				University university = new University();
				
				// Add students to the university
		        university.addStudent(student1);
		        university.addStudent(student2);
		        university.addStudent(student3);
		        
		        System.out.println("\nUniversity ------ \n" + university.getStudents());
		        System.out.println("\nGetting student------\n" + university.getStudent(123));
		        System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
		        System.out.println("\nSeaching student------\n" + university.searchStudent("testUserna"));

		        System.out.println("\nUniversity ------ \n" + university.getStudents());

		    }
		}