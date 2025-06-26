package com.index;
import java.util.Scanner;
public class Task_14_2 {
	public static void main(String[]args) {
		Scanner py = new Scanner(System.in);
		System.out.println("Enter the Number of Elements");
		int size = py.nextInt();
        int[] nums = new int[size];
		System.out.println("Enter " +size+ " Elements");
		for(int i=0;i<size;i++) {
			nums[i] = py.nextInt();
		}
		for(int i=1;i<size;i++) {
			//print spaces
			for(int j=1;j<=size-i;j++) {
			System.out.print(" ");
			}
		for(int k=0;k<i;k++) {
		System.out.print(nums[k]+" ");
		}
		System.out.println();
		}
		
		py.close();
	}

}
