package com.bptn.course._01_exceptionPropagation;

public class Main {
// Method to demonstrate exception propagation
public static void method1() {
int [] arr  = {1, 2, 3, 4};
System.out.println("Accessing element at index 4: " + arr[4]);

}
// Method to handle exception and demonstrate propagation
public static void method2() {
try {
   method1();
} catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("ArrayIndexOutOfBoundsException handled");
	
}
}
// main() method to run the program
public static void main(String args[]) {
   Main exceptionSolutionObject = new Main();
   exceptionSolutionObject.method2(); // Calling method2 to demonstrate exception propagation
}
}