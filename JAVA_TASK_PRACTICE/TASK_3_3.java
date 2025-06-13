package com.index;
import java.util.Scanner;
public class TASK_3_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num = input.nextInt();
		int i = 1;
		while(i<=10) {
			System.out.println(num +"X"+i+"="+(num*i));
			i++;
		}
		
		
	}
}
