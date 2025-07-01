package com.index;
import java.util.Scanner;
public class Task_17_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word ");
		String word = sc.nextLine();
		String reverse = "";
		for(int i = word.length()-1;i>=0;i--) {
			reverse +=word.charAt(i);
		}
		System.out.println("Reverse String :" +reverse);
		
		if(word.equalsIgnoreCase(reverse)){
			System.out.println("It is a Palindrome :"+reverse);
		}else {
			System.out.println("It is Not a Palindrome ");
		}
	}

}
