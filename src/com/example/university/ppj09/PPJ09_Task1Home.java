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
//        1    001
//            2    00 000 010
//            3    00 000 011
//            4    00 000 100
//            5    00 000 101
//            6    00 000 110
//            7    00 000 111
//            10   00 001 000  A(hex)
//            17   00 001 111  F()hex
//            20   00 010 000
//            30   00 011 000
//            37   00 011 111
//            40   00 100 000  4A
//            50   00 101 000
//            60   00 110 000
//            70   00 111 000
//            77   00 111 111  8A - 1 = 89;
//            100  01 000 000  8A (hex)
//            0010   1101 = 40 + 15 =55
//            101101
       int i = (int) l;
        System.out.println(i);
        for(int n = 1; n<=10; n = n + 1){
            sum += (double)1/ Math.pow(2,n);
        }
        System.out.println(sum);
    }
}
