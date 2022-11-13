package com.example.university.ppj09home;

public class Test8 {
    public static void main(String[] args) {
        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= 9; col++) {
                if (row == col) {
                    System.out.print(" x ");
                } else if (col == 10 - row) {
                    System.out.print(" x ");
                } else if (col == 1) {
                    System.out.print(" x ");
                } else if (col == 9) {
                    System.out.print(" x ");
                } else if (row == 1) {
                    System.out.print(" x ");
                } else if (row == 9) {
                    System.out.print(" x ");
                } else {
                    System.out.print(" . ");
                }

            }
            System.out.println();
        }
    }
}
//  row = 1   col = 8   = 9-row
// row = 2    col = 7
// row = 3   col = 6