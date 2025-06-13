package com.index;
import java.util.Scanner;
public class Task_1_2 {
	public static void main(String[] args)
	{
		java.util.Scanner circle = new Scanner(System.in);
		    System.out.println("Enter a radius of circle:");
	        double radius = circle.nextDouble();

	        // Constants
	        final double PI = 3.141592653589793;

	        // Calculations
	        double area = PI * radius * radius;
	        double perimeter = 2 * PI * radius;
	        
	        System.out.println("Area of circle :" +area);
	        System.out.println("Perimeter of circle:" +perimeter);
	        
	        circle.close();
	}

}
