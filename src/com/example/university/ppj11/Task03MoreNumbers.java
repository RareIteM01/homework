package com.example.university.ppj11;

public class Task03MoreNumbers {
    public static void main(String[] args) {
        int[] array = {2, 6, 4, 8, 3, 1};
        int max = array[0];
        for (int col = 0; col < array.length; col++) {
            if (max < array[col]) {
                max = array[col];
            }
        }
        for (int row = 8; row > 0; row--) {
            for (int col = 0; col < array.length; col++) {
                if ( 9 - row <= array[col]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
