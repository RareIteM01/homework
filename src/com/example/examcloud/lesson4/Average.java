package com.example.examcloud.lesson4;

public class Average {
    public static void main(String[] args) {
        double[] values = {1.9, 15.67, 2.85, 9.6, 1.5};
        double result = 0;

        for (double i : values) {
            result = result + i;
        }
        System.out.println(" Average  =  " + result / values.length);
    }
}

