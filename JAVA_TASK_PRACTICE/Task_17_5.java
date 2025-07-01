package com.index;
import java.util.Scanner;
public class Task_17_5 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int number = num.nextInt();
		int nums = 1;
		
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(nums+" ");
				nums++;
			}
			System.out.println();
		}
	}

}
