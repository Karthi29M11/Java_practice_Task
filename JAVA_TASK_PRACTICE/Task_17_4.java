package com.index;
import java.util.Scanner;
public class Task_17_4 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sn.nextLine();
		
		char[] chars = str.toCharArray();
		char maxChar = chars[0];
		int maxcount = 1, count =1;
		
		for(int i=1;i<chars.length;i++) {
			if(chars[i] == chars[i-1]) {
				count++;
				if(count>maxcount) {
					maxcount = count;
					maxChar = chars[i];
				}	
			}else {
				count =1;
			}
		}
		System.out.println("Longest character :"+maxChar+" Repeated "+maxcount+"Times");
	}

}
