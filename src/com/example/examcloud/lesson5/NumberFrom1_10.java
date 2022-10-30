package com.example.examcloud.lesson5;

import java.util.Scanner;

public class NumberFrom1_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scan.nextInt();
        if (a>=0 && a<10) {
            System.out.println("Положительное число меньше 10 или ноль");
        }else{
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }

}

