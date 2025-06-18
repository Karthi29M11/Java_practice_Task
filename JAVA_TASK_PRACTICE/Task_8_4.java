package com.index;

import java.util.Scanner;

public class Task_8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter numbers separated by space:");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        for (String numStr : numbers) {
            int num = Integer.parseInt(numStr);
            switch (num) {
                case 0: System.out.print("Zero "); break;
                case 1: System.out.print("One "); break;
                case 2: System.out.print("Two "); break;
                case 3: System.out.print("Three "); break;
                case 4: System.out.print("Four "); break;
                case 5: System.out.print("Five "); break;
                case 6: System.out.print("Six "); break;
                case 7: System.out.print("Seven "); break;
                case 8: System.out.print("Eight "); break;
                case 9: System.out.print("Nine "); break;
                default: System.out.print("? "); break; // for numbers outside 0-9
            }
        }

        scanner.close();
    }
}
