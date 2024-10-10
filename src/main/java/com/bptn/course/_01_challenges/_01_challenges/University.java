package com.bptn.course._01_challenges._01_challenges;
import java.util.*;
import java.util.stream.Collectors;

public class University {

	// property - get inspired by the UML diagram
	private List<Student> students = new ArrayList<>();
	// add a student to the "university" arraylist


	public void addStudent(Student s) {
		students.add(s);
	}	

   // Get all students in the university (getter method)
    public List<Student> getStudents() {
        return students;
    }
		// get the first student in the university that has the studentId. (ideally, this would be unique, so you can stop searching after finding the fist match)
	 public Student getStudent(long studentId) {	
    for (Student student : students) {
			if (student.getStudentId() == studentId) {
				return student;
			}
		}
		return null; // Return null
	}

	public List<Student> searchStudent(String userNamePrefix) {
		// return all students that have usernames beginning with the prefix 
		List<Student> matchingStudents = new ArrayList<>();
		for (Student student : students) {
			if (student.getUserName().startsWith(userNamePrefix)) {
				matchingStudents.add(student);  // Add matching student to the list
			}
		}
		return matchingStudents;  // Return the list of matching students
	}

	public boolean deleteStudent(long studentId) {
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if (student.getStudentId() == studentId) {
				iterator.remove();  // Remove the student from the list
				return true;  // Return true if a student was deleted
			}
		}
		return false;  // Return false if no student with the given ID was found
	}
  @Override
public String toString() {
    String result = "University Students: \n";
    for (Student student : students) {
        result += student + "\n";  // Concatenate each student's toString output
    }
    return result;
}
}
