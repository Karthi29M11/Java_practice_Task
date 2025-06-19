package com.index;

public class Task_10_3 {

	public static void main(String[] args) {
		int[] arr = {112,300,765,123,444};
		int min = arr[0];
		for(int i=0;i < arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("The Smallest Number in the array is :" +min);
	}
}
