package com.example.university.PPJ12;

public class Task02 {
    public static void main(String[] args) {
        int[] a = {-1, 9, 3, 0, -3, 2, 4};
        for (int el : a) {
            System.out.print(el + " ");
        }
        System.out.println();
        exchangeBoundaries(a);
        for (int el : a) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    static void exchangeBoundaries(int[] arr) {
        int minIx = 0, maxIx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[minIx] > arr[i]) minIx = i;
            if (arr[maxIx] < arr[i]) maxIx = i;
        }
        int tmp = arr[minIx];
        arr[minIx] = arr[maxIx];
        arr[maxIx] = tmp;
    }
}
