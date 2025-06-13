package com.index;
import java.util.Scanner;
public class Task_1_3 {
	
	public static void main(String[] args)
	{
		java.util.Scanner student = new Scanner(System.in);
		
		String name;
		int roll_number,s1,s2,s3,s4,s5;
		double avg_sub;
		
		System.out.println("Enter a Name :");
		name = student.nextLine();
		System.out.println("The Name of the Student:" +name);
		
		System.out.println("Enter a RollNumber :");
		roll_number = student.nextInt();
		System.out.println("The Student RollNumber is :");
		
		System.out.println("S1 mark :");
		s1 = student.nextInt();
		System.out.println("S1 mark is" +s1);
		
		System.out.println("S2 mark :");
		s2 = student.nextInt();
		System.out.println("S2 mark is" +s2);
		
		System.out.println("S3 mark :");
		s3 = student.nextInt();
		System.out.println("S3 mark is" +s3);
	
		System.out.println("S4 mark :");
		s4 = student.nextInt();
		System.out.println("S4 mark is" +s4);
		
		
		System.out.println("S5 mark :");
		s5 = student.nextInt();
		System.out.println("S5 mark is" +s5);
		
	
		avg_sub = (s1+s2+s3+s4+s5)/5.0;
		System.out.println("Average of all Subject :" +avg_sub);	
		
		student.close();
		
		
	}

}
