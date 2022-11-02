package com.example.examcloud.lesson4;

import java. util.Scanner;

public class Garland {
    public static void main(String[] args) {
//        Scanner scan = new Scanner (System.in);
        int a = 1275465549;
        System.out.println(" " + Integer.toBinaryString(a));
        blink (a);
    }

    static void blink(int a) {
        System.out.println(Integer.toBinaryString(~a));
    }
}
