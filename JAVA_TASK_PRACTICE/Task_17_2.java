package com.index;
import java.util.Scanner;
public class Task_17_2 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Word");//get a input string from user
	    String b = a.next();//Save into b read the input(without space)
		String reverse = "";//Stores the reversed version of word
		for(int i=b.length()-1;i>=0;i--) {//starting the loop at last Character goes backward to first Character
			reverse +=b.charAt(i);//save a character using charAt(i)and save into reverse
		}
		System.out.println("Reverse :" +reverse);
		//Looping from last to first:

//b.charAt(5) = 'i' → reverse = "" + 'i' → reverse = "i"

//b.charAt(4) = 'h' → reverse = "i" + 'h' → reverse = "ih"

//b.charAt(3) = 't' → reverse = "ih" + 't' → reverse = "iht"
		
	}

}
