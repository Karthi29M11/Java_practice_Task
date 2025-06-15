package com.index;
import java.util.Scanner;
public class Task_7_3{

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter a Number :");
		int num = obj.nextInt();
		obj.close();
		
		int orginal = num;
		int reverse = 0;
		
		for(int n =num; n > 0; n = n/10) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
		}
		if(orginal == reverse) {
			System.out.println(orginal + " is a Palindrome");
		}	else {
			System.out.println(orginal + "is not a Palindrome");
		}
		
		
		
		
	}

}
