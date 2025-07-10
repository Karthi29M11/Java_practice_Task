package com.index;
import java.io.IOException;
class NoAgeUnderException extends Exception{
	public NoAgeUnderException(String message) {
		super(message);
	}
}
public class Task_21_1 {
	public static void main(String[] args) {
		try {
			int age = 20;
			System.out.println("Checking : "+age);
			underAge(age);
		}catch(NoAgeUnderException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
	public static void underAge(int age) throws NoAgeUnderException{
		if(age>=18 && age<=45) {
			System.out.println("Age in Within allowed Range : "+age);
		}
		else {
			throw new NoAgeUnderException("Age must be between 18 to 45.Provide: "+age);	
		}
		
		}
	}


