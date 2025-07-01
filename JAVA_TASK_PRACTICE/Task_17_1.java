package com.index;
import java.util.Scanner;
public class Task_17_1 {
	public static void main(String[] args) {
		Scanner re = new Scanner(System.in);
		System.out.print("Enter the Number");//Get input from user
		int s = re.nextInt();//nextInt() read the full integer from the user and stores into s
		int reverse = 0;//to store the reverse number
		while(s !=0) {//loops executing until s become 0
			int digit = s % 10;//% use to get the last digit
			reverse = reverse * 10 +digit;//shift digit left and add new digit
			s = s/10;//remove the last digit and removes the reminder
		}
		System.out.println("Reversed:"+reverse);
	}

}
//Iteration	s	digit = s % 10	reverse = reverse * 10 + digit	Updated s = s / 10
//1	456	6	0 * 10 + 6 = 6	45
//2	45	5	6 * 10 + 5 = 65	4
//3	4	4	65 * 10 + 4 = 654	0 → loop ends