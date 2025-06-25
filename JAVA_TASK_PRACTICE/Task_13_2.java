package com.index;
import java.util.Scanner;
public class Task_13_2 {
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.println("Enter the size of First Array");
		int size1 = Integer.parseInt(str.nextLine());
		System.out.println("Enter the size of Second Array");
		int size2 = Integer.parseInt(str.nextLine());

		String[] arr1 = new String[size1];
		System.out.println("Enter " +size1+ " First Element");
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = str.nextLine();
		}
		String[] arr2 = new String[size2];
		System.out.println("Enter " +size2+ " Second Element");
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = str.nextLine();
		}
		boolean equal = true;
		if(arr1.length != arr2.length) {
			equal = false;
		}
		else {
			for(int j=0;j<arr1.length;j++) {
				if(!arr1[j].equalsIgnoreCase(arr2[j])) {
					equal=false;
					break;
				}
			}
			if(equal) {
				System.out.println("Arrays are Equal");
			}
			else {
				System.out.println("Arrays are not Equal");
			}
		}
		
		str.close();
		}

}
