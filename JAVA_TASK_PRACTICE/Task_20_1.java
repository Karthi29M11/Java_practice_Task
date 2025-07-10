package com.index;

class Even extends Thread {
    public void run() {
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number: " + i);
            }
            try {
                Thread.sleep(1000); // Simulate processing delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Odd extends Thread {
    public void run() {
        for (int i = 0; i <= 30; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Number: " + i);
            }
            try {
                Thread.sleep(1000); // Simulate processing delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Task_20_1 {
    public static void main(String[] args) {
        Even evenThread = new Even();
        Odd oddThread = new Odd();

        evenThread.start(); // Start even numbers thread
        oddThread.start();  // Start odd numbers thread
    }
}
