package com.example.examcloud.lesson4;

import java.util.Scanner;

public class SmallestNumberByModule {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("input 3 numbers:");
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double c = Double.parseDouble(scan.nextLine());

        double a1 = Math.abs(a);
       System.out.println("Number absolute value " +a1);
        double i= 3;
        String result = i < 5 ? "i<5" : "i>=5";
        System.out.println(result);
    }
}