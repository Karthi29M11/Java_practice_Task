package com.index;

public class Task_11_3 {
	public static void main(String[] args) {
		int[] a1 = {11,12,13,14,15};
		int[] a2 = {12,16,11,17,18};
		
		System.out.println("Common Integer :");
		for(int i=0; i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					System.out.println("Same Integer in a1 :" +a1[i]+ "Same Integer in a2 :" +a2[j]);
				}
			}
		}
		
	}

}
