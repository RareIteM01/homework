package com.example.university.ppj09;

import java.util.Scanner;

public class PPJ09_Task4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();

        for (int row = 0; row <= size; row++) {
            for (int col = 0; col <= size; col++) {
                if(size-col<=row) System.out.print("x");
                else System.out.print(".");
            }
            for (int col = 1; col <= size; col++) {
                if(col<=row) System.out.print("x");
                else System.out.print(".");
            }
            System.out.println();
        }
    }
}
