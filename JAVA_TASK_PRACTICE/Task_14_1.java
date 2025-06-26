package com.index;
import java.util.Scanner;
public class Task_14_1 {
	public static void main(String[]args) {
		Scanner py = new Scanner(System.in);
		System.out.println("Enter the Number of Elements");
		int row = py.nextInt();
        
		for(int i=1;i<=row;i++) {
			//print spaces
			for(int j=1;j<=row-i;j++) {
			System.out.print(" ");
			}
		for(int k=1;k<=i;k++) {
		System.out.print(i+" ");
		}
		System.out.println();
		}
		
		py.close();
	}

}
