package com.example.lesson01;

public class Task1 {
    public static void main(String[] args) {
        int a = 66, b = 32;
        byte b1 = 127, b2 = 100;
        System.out.println(b1 + 1);
        double c = 1.5, d = 0.7;
        char e = 54, f = 'A';
//        example1(a, b, c, d);
//        System.out.println(e);
//        System.out.println(e + 65530);
//        System.out.println(e - f);
//        System.out.println(e * f);
//        System.out.println(e / f);
//        System.out.println(e % f);
//        System.out.println("text " + a + " " + b);
//        int num = 40;
//        System.out.println(num % 2 == 0 ? "even" : "odd");
boolean aa = true, bb= false;
        System.out.println( aa && bb);
        System.out.println("3rd task");
        boolean z = true, x = false, y = true, w = false;
        System.out.println("|| " + z + " " + x);
        System.out.println(y + " " + (z || y) + " " + (x || y));
        System.out.println(w + " " + (z || w) + " " + (x || w));

        System.out.println("&& " + z + " " + x);
        System.out.println(y + " " + (z && y) + " " + (x && y));
        System.out.println(w + " " + (z && w) + " " + (x && w));

        System.out.println(0x13621);
        System.out.println(0b00010011011000100001);

    }

    private static void example1(int a, int b, double c, double d) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println();
        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c % d);
        System.out.println();
    }
}