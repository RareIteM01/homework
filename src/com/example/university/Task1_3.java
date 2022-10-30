package com.example.university;

public class Task1_3 {
    public static void main(String[] args) {
        //Task1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Task2
        for (int pow = 1; pow <= 1024; pow = pow * 2) {
            System.out.println(pow);
        }
        //Task3
        int a = 10;
        while (a > 11) {
            System.out.println("while");
        }
        do {
            System.out.println("do-while");
        } while (a > 11);
    }
}

