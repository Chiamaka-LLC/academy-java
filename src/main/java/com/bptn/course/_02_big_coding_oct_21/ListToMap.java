package com.bptn.course._02_big_coding_oct_21;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

    // create static method "convertStudentListToMap"
public static Map<Integer, Student> convertStudentListToMap(List<Student> students) {
return students.stream()
					.collect(Collectors.toMap(Student::getId, student -> student));
}
    // Complete the main method
	public static void main(String[] args) {
		// Create a list of students
        
		List<Student> students = new ArrayList<>();
        //add student objects to this list
		students.add(new Student(1, "Alice", 20));
		students.add(new Student(2, "Bob", 22));
		students.add(new Student(3, "Charlie", 21));

        // Call "convertStudentListToMap" method and hold the returned value in "studentMap" variable.
		Map<Integer, Student> studentMap = convertStudentListToMap(students);
		
        // Print the map
        System.out.println("Students Map: "+ studentMap);
    }
}
/*
Summary:
This task introduced me to converting a list of objects into a map using Java Streams. 
I learned how to use `Collectors.toMap` for this purpose, which was new to me. 
I initially faced challenges in understanding method signatures and type definitions but resolved them through careful adjustments. 
In the future, I will remember the utility of Streams for efficient data manipulation in Java.
*/