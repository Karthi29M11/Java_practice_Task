package com.index;
import java.util.Scanner;
public class Task_13_1 {
	public static void main(String[] args) {
		Scanner array = new Scanner(System.in);
		System.out.print("Enter an Size of Element");
		int size = array.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter "+ size + " Elements ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=array.nextInt();
			}
		System.out.print("Enter an Size of Element");
		int size1 = array.nextInt();
		int[] arr2 = new int[size1];
		System.out.println("Enter  " +size1+ " Element");
		for(int j=0;j<arr2.length;j++) {
			arr2[j] = array.nextInt();
		}
		boolean equal = true;
		if(arr.length != arr2.length) {
			equal = false;
		}
		else{
			for(int i=0;i<arr.length;i++) {
				if(arr[i] != arr2[i]) {
					equal = false;
					break;
				}
			}
			if(equal=true) {
				System.out.println("Array are Equal");
			}
			else {
				System.out.println("Array are not Equal");
			}
		}
		array.close();
	}

}
