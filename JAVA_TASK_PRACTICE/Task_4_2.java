package com.index;
import java.util.Scanner;
public class Task_4_2 {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	while(true) {
	System.out.print("Enter the Screen Number 1,2,3 & 4: ");
	int screenNumber = input.nextInt();
	input.nextLine();
	System.out.print("Enter the Timing(7-10am,10-1pm,1-4pm): ");
	String timing = input.nextLine();
	switch(screenNumber) {
	case 1:
		System.out.println("Select Screen 1 :");
		switch(timing) {
		case "7-10":
			System.out.println("The Movie at 7-10 is Thug Life");
			break;
		case "10-1":
			System.out.println("The Movie at 10-1 is Eleven");
			break;
		case "1-4":
			System.out.println("The Movie at 1-4 is DDnextLevel");
			break;
		default:
			System.out.println("Invild input");
			}
		break;
	case 2:
		System.out.println("Select Screen 2 :");
		switch(timing) {
		case "7-10":
			System.out.println("The Movie at 7-10 is Incebtion");
		break;
		case "10-1":
			System.out.println("The Movie at 10-1 is FinalDestination");
			break;
		case "1-4":
			System.out.println("The Movie at 1-4 is Fast-X");
		break;
		default:
			System.out.println("Invalid input");
		}
		break;
	case 3:
		System.out.println("Select Screen 3 :");
		switch(timing) {
		case "7-10":
			System.out.println("The Movie at 7-10 is Retro");
			break;
		case "10-1":
			System.out.println("The Movie at 10-1 is Tourist Family");
			break;
		case "1-4":
			System.out.println("The Movie at 1-4 is Thundrum");
		break;
		default:
			System.out.println("Invalid input");
			}
		break;
	case 4:
		System.out.println("Select Screen 4 :");
		switch(timing) {
		case "7-10":
			System.out.println("The Movie at 7-10 is Dragon");
			break;
		case "10-1":
			System.out.println("The Movie at 10-1 is Vidamuyrichi");
			break;
		case "1-4":
			System.out.println("The Movie at 1-4 is Neek");
			break;
			default:
				System.out.println("Invalid input");
		}
		
		
		}
		
		}
	}

		
	}
