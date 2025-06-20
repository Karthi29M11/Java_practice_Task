package com.index;

public class Task_11_2 {
	public static void main(String[] args) {
	String[] word1 = {"SLA","Institute","KKnagar"};
	String[] word2 = {"SLA","Institute","OMR"};
	
	System.out.println("Commom Elements :");
	for(int i=0;i < word1.length;i++) {
		for(int j=0;j < word2.length;j++) {
			if(word1[i] == word2[j]) {
				System.out.println("The word1 is :"+word1[i]+ " "+" The word2 is :" + word2[j]);
				
			}
		}
	}
		
	
	}

}
