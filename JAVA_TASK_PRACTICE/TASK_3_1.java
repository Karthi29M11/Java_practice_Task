package com.index;
import java.util.Scanner;
public class TASK_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = input.nextInt();
		if(num>0) {
			System.out.println("The number of " + num + " is " +num*num*num);
		}else {
			System.out.println("The number is Not valid");
		}
		input.close();
	}

}
