package com.example.examcloud.lesson4;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("input 3 numbers:");
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double c = Double.parseDouble(scan.nextLine());
        if (a > c) {
            if (c > b) {
                System.out.println("The smallest number from: " + a + "  " + b + "  " + c);
                System.out.println("The smallest number is: " + b);
            } else {
                System.out.println("The smallest number from: " + a + "  " + b + "  " + c);
                System.out.println("The smallest number is: " + c);
            }
        } else {
            if (a > b) {
                System.out.println("The smallest number from: " + a + "  " + b + "  " + c);
                System.out.println("The smallest number is: " + b);
            } else {
                System.out.println("The smallest number from: " + a + "  " + b + "  " + c);
                System.out.println("The smallest number is: " + a);
            }
        }
    }
}
