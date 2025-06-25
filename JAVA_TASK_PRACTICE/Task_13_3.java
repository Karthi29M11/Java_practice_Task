package com.index;
import java.util.Scanner;
public class Task_13_3 {

	public static void main(String[] args) {
		Scanner cha = new Scanner(System.in);
		System.out.println("Enter the Size of 1st Array");
		int size1 = cha.nextInt();
		System.out.println("Enter the Size of 2nd Array");
		int size2 = cha.nextInt();
		
		char[] arr1 = new char[size1];
		System.out.println("Enter " +size1+ " 1st Element");
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = cha.next().charAt(1);
		}
		char[] arr2 = new char[size2];
		System.out.println("Enter " +size2+" 2nd Element");
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = cha.next().charAt(1);
		}
		boolean equal = true;
		if(arr1.length != arr2.length) {
			equal = false;
		}else {
			for(int j=0;j<arr1.length;j++) {
				if(arr1[j]!=(arr2[j])) {
					equal = false;
					break;
					}
			}
		}
				if(equal) {
					System.out.println("Arrays are Equal");
				}else {
					System.out.println("Arrays are not Equal");
				}
			cha.close();
		}
}
