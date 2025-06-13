package com.index;

import java.util.Scanner;

public class TASK_3_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first floating number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second floating number: ");
        double num2 = input.nextDouble();

        // Round both numbers to two decimal places
        num1 = Math.round(num1 * 100.0);
        num2 = Math.round(num2 * 100.0);

        if (num1 == num2) {
            System.out.println("The two numbers are the same up to two decimal places.");
        } else {
            System.out.println("The two numbers are different.");
        }

        input.close();
    }
}
