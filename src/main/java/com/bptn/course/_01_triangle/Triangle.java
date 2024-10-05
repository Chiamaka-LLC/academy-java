package com.bptn.course._01_triangle;

public class Triangle {

	
	
	
// Write perimeterCalculator method 
	public int perimeterCalculator(int a, int b, int c){
		return (a + b + c);
	}	
    // Write areaCalculator method
		public int areaCalculator(int b, int h) {
			return (b * h)/2;
			
		}	
    // Do not modify the code below:
	public static void main(String[] args) {
		Triangle object = new Triangle();

		int a = 7;
        int b = 10;
        int c = 35;

        int perimeter = object.perimeterCalculator(a,b,c);
        int area = object.areaCalculator(7,10);

        System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);

	}
}
/*Summary
This program calculates the perimeter and area of a triangle.
Some difficulties I faced: I tried running the methods as static methods,
but this failed as static void is used for only
methods that won't return values.
In the future, I will remember this as name my methods 
appropriately.
*/
