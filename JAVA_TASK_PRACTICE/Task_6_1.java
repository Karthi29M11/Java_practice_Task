package com.index;

public class Task_6_1 {
	static int a=20 , b=100;
	int c = 10;
	void division() {
		System.out.println("Division :"+ (b/c));
	}
	
	static void addmulti() {
		System.out.println("Addition :" + (a+b));
		System.out.println("Multiplication :" +(a*b));
	}
	
	public static void main(String[] args) {
		addmulti();
		Task_6_1 obj = new Task_6_1();
		obj.division();
		
	}

}
