package com.example.university.test;

public class TestTask2 {
    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        int a = 7;
        for (; ; ) {
            if (a < 0) {
                break;
            }
            int b = a * 2;
            System.out.println(b);
            a -= 2;
        }
    }

    private static void example2() {
        for (int a = 7; a < 0; a -= 2) {
            int b = a * 2;
            System.out.println(b);
        }
    }

    private static void example3() {
        int a = 0;
        for (a = 7; a > 0; a -= 4) {
            System.out.println(a * 2);
            a += 2;
        }
    }
}
