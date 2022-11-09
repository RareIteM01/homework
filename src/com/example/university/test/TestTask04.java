package com.example.university.test;

public class TestTask04 {
    public static void main(String[] args) {
        int a = 49;
        boolean isPrime = true;
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is non prime");
        }

    }
}
