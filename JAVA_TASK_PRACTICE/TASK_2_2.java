package com.index;
import java.util.Scanner;
public class TASK_2_2 {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int num = number.nextInt();
		number.close();
		
		
		if((num % 2 == 0 || num == 0)) {
			System.out.println("It is Even Number :" +num);
		}
	    if((num % 2 != 0 && num != 0)) {
			System.out.println("It is Odd Number :" +num);
		}

	}
}
