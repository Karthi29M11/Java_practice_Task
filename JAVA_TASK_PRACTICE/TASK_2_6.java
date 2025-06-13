package com.index;
import java.util.Scanner;
public class TASK_2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner day = new Scanner(System.in);
		
		System.out.println("Enter the month:");
		int month = day.nextInt();
		System.out.println("the month this:"+month);
		
		System.out.println("Enter the year:");
		int year = day.nextInt();
		System.out.println("the year this:"+year);
		
		//logical
		
		int days =0;
		
		if ((month == 1) || (month == 3) || (month == 5) ||  (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
			days = 31;
		}else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)){
			days = 30;
		}else if (month == 2) {
			if(month % 4==1 ) {
				days=29;
			}else {
				days=28;
			}
		}
	}