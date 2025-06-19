package com.index;

public class Task_10_1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] arr3 = new int[arr1.length + arr2.length];

        // Copy arr1
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        // Copy arr2
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        // Print the concatenated array
        System.out.print("Concatenated Array: ");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }
}
