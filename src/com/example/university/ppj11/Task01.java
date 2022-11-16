package com.example.university.ppj11;

public class Task01 {
    public static void main(String[] args) {
        int[] array = {-29, -3, -11, -5, -6, -28, -7, -8, -2};
        int max = array[0];
        for (int a = 0; a < array.length; a++) {
            if (array[a] > max) {
                max = array[a];
            }
        }
        System.out.println(max);
    }
}