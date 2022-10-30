package com.example.examcloud.lesson4;

import java. util.Scanner;

public class Garland {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a = 43;
        System.out.println("a = " + Integer.toBinaryString(43));
    }

    static void blink(int a) {
        a = ~a;
        System.out.println(Integer.toBinaryString(43));
    }
}
