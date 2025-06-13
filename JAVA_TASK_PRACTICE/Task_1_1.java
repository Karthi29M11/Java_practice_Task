package com.index;
import java.util.Scanner;
public class Task_1_1 {
	
	public static void main(String[] args)
	{
		java.util.Scanner math = new Scanner(System.in);
		
		int a,b,result;
		
		System.out.println("Enter a 1st Number:");
		a = math.nextInt();
		System.out.println("The Value of a is : " +a);
		
		System.out.println("Enter a 2nd Number:");
		b = math.nextInt();
		System.out.println("The Value of b is :" +b);
		
		result = a + b;
		System.out.println("Sum :" +result);
		
		result = a - b;
		System.out.println("Subtraction :" +result);
		
		result = a * b;
		System.out.println("Multiplication :" +result);
		
		result = a / b;
		System.out.println("Division :" +result);
		
		result = a % b;
		System.out.println("Reminder :" +result);
		
		 if (b != 0) {
	            int div = a / b;
	            int rem = a % b;
	            System.out.println("Division: " + div);
	            System.out.println("Remainder: " + rem);
	        } else {
	            System.out.println("Division and remainder cannot be performed (division by zero).");
	        }

		
		math.close();
	}

}
