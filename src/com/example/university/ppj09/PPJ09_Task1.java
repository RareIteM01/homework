package com.example.university.ppj09;

public class PPJ09_Task1 {
    public static void main(String[] args) {
        //Task1
        for (char ch = 75; ch <= 150; ch++) {
            System.out.println(ch + " - " + (int) ch);
        }
        //Task2
        double sum = 0;
        for (int n = 1; n <= 10; n++) {
            sum += 1 / (Math.pow(2, n));
            System.out.println(sum);
        }
    }
    private static void example2() {
        double sum = 0;
        for(int a = 3; a<=10; a = a + 1){
            sum += (double)1 / (a * a);
        }
//        System.out.println("Hello world");
        System.out.println("sum = " + sum);
    }
}
