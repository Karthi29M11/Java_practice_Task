package com.index;

public class Task_10_2 {
	public static void main(String[] args) {
		int[] a = {99,200,882,334,22};
		int max = a[0];
		for(int i=0;i<a.length; i++) {
			if (a[i] > max) {
			max = a[i];
		}
	}
		System.out.println("Largest Number in the Array is : " +max);
		

	}
}
