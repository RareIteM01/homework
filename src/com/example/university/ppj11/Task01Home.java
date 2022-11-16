package com.example.university.ppj11;

public class Task01Home {
    public static void main(String[] args) {
//        max();
        int[] array = {10, 40, 7, 34, 35, 80, 17};
        int max = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (max < array[i + 1]) {
                max = array[i + 1];
            }
        }
        System.out.println(max);
    }

    public static void max() {
        int a = 10;
        int b = 8;
        int y;
        if (a < b) {
            y = b;
        } else {
            y = a;
        }
        System.out.println(y);
    }
}
