package com.example.university.test;

public class TestTask03 {
    public static void main(String[] args) {
        example2();
    }

    private static void example2() {
        char c = 'C', f = 'F';
        if (c % f != 0)
            System.out.println(c + 4);
        else System.out.println(f - 2);
    }

    public static void example1() {
        char ch = 2 * '$';
        System.out.println(ch);
        for (; ch <= 'C' + 200; ch++){
            System.out.print(ch);
        }
    }
}
