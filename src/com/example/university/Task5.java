package com.example.university;

public class Task5 {
    public static void main(String[] args) {
        for (int rows = 0; rows < 7; rows++) {
            for (int col = 0; col < 7; col++) {
                if ((rows + col) % 2 == 0)
                    System.out.print("o");
                else System.out.print("x");
            }
            System.out.println();
        }
    }
}
