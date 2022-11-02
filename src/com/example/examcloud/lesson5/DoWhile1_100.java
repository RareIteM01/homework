package com.example.examcloud.lesson5;


import java.util.Scanner;

public class DoWhile1_100 {
    public static void main(String[] args) {
        runVariantScannerExampleWhileDo();
    }

    private static void runVariant1() {
        int number = 1;
        do {
            if (number % 5 == 0) {
                System.out.println("number = " + number);
            }
            number++;
        } while (number <= 100);
    }

    private static void runVariant2() {
        int number = 5;
        do {
            System.out.println("number = " + number);
            number += 5;
        } while (number <= 0);
    }

    private static void runVariantWhileDo() {
        int number = 5;
        while (number <= 0) {
            System.out.println("number = " + number);
            number += 5;
        }
    }

    private static void runVariantScannerExampleInt() {
        Scanner scan = new Scanner(System.in);
        int number;
        do {
            System.out.println("Put the value");
            number = scan.nextInt();
        } while (number != 9);
    }

    private static void runVariantScannerExampleString() {
        Scanner scan = new Scanner(System.in);
        String number;
        do {
            System.out.println("Put the value");
            number = scan.nextLine();
        } while (!number.equals("exit"));
    }
    private static void runVariantScannerExampleWhileDo() {
        Scanner scan = new Scanner(System.in);
        String number;
        System.out.println("Put the value");
        number = scan.nextLine();
        while (!number.equals("exit")) {
            System.out.println("Put the value");
            number = scan.nextLine();
        }
    }
}
//удалить 61 и 60, 57, 58, посмоотреть как меняется выполнение програмы


