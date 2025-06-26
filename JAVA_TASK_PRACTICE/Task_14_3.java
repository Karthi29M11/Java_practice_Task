package com.index;

public class Task_14_3 {

    public static void main(String[] args) {
        int row = 10;
        char[][] star = new char[row][];
        

        // Initialize each row
        for (int i = 0; i < row; i++) {
            star[i] = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                star[i][j] = '*'; // Fill with star character
            }
        }

        // Print the pyramid
        for (int i = 0; i < star.length; i++) {

            // Print leading spaces for center alignment
            for (int space = 0; space < row - i - 1; space++) {
                System.out.print(" ");
            }

            // Print stars from the array
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j] + " ");
            }

            // Move to next line
            System.out.println();
        }
    }
}
