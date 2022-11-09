package com.example.university.ppj09;

public class PPJ09_Task1Home {
    public static void main(String[] args) {
        example3();
    }

    private static void example1() {
        int sum = 0;
        for(int a = 3; a<=10; a = a + 1){
            sum = sum + a * a;
            System.out.println("a = " + a);
            System.out.println("sum = " + sum);
        }
//        System.out.println("Hello world");
        System.out.println("sum = " + sum);
    }
    private static void example2() {
        double sum = 0;
        for(int a = 3; a<=10; a = a + 1){
            sum += (double)1 / (a * a);
            System.out.println("a = " + a);
            System.out.println("sum = " + sum);
        }
//        System.out.println("Hello world");
        System.out.println("sum = " + sum);
    }
    private static void example3() {
        double sum = 0;
        Double sum1 = 0.0;
        String a = "";
        boolean b = true;
        b = false;
        double c = 134;
        long l = 12540000000000L;
//        1111;
//        11 = 3
//        100 = 4
//        111 = 7
//        1000 = 8 (dec); =10 (oct)
//        1111 = 15 (dec)=  F (hex) = 17 (oct)
//        10000 = 16 (dec) = 10 (hex) = 20 (oct)
//        27 (oct) + 1 = 30
//        101 (binary) = 6
       int i = (int) l;
        System.out.println(i);
        for(int n = 1; n<=10; n = n + 1){
            sum += (double)1/ Math.pow(2,n);
        }
        System.out.println(sum);
    }
}
