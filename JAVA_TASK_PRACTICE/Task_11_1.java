package com.index;
import java.util.Scanner;
public class Task_11_1 {

	public static void main(String[] args) {
	Scanner element = new Scanner(System.in);
	System.out.print("Enter the Size of the array :");
	int size = element.nextInt();
	int[] arr = new int[size];
	System.out.println("Enter " +size+ " Element");
	for(int i=0;i<arr.length;i++) {
		arr[i]=element.nextInt();
	}
	System.out.println("Enter the Element : ");
	int index = element.nextInt();
	boolean found=false;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==index) {
			System.out.println("The index is :" +i);
		}
		
		
	}
	element.close();
	}

}
