package com.example.examcloud.lesson5;

public class FiveSymbols {
    public static void main(String[] args) {
        for (char a = 'h'; a < 'z'; a++) {
            System.out.print(a);
        }
        System.out.println("\n----------------------");
        char ch = 'a';
        System.out.println((int)ch);
        for (int i = 0; i < 1000; i++){
            System.out.print((int)(ch +i)+" ");
        }
    }
}