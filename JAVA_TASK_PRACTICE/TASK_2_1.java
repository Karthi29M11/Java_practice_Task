package com.index;
import java.util.Scanner;

public class TASK_2_1 {

	public static void main(String[] args) {
		Scanner check = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
	    int number = check.nextInt();
	    
		if(number >= 0 && number != 0) {
			System.out.println("is Positive : "+number);
		}
		 if(number < 0 || number == 0) {
			System.out.println("is Negative :" +number);
		}
	    check.close();
	}
}
