package com.example.university.PPJ12;

public class Task01 {
    public static void main(String[] args) {
        int[] a = {2, 6, 3, 9, -3, 7, 5};
        printArray(a);
        System.out.println(diffEven1(a));
        System.out.println();
        System.out.println(diffEven(a));
    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length - 1] + ". ");
    }

    static int diffEven(int[] arr) {
        int firstEvenIx = 0;
        int lastEvenIX = 0;
        int counterEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                lastEvenIX = i;
                counterEven++;
            }
            if (counterEven == 1) {
                firstEvenIx = lastEvenIX;
            }
        }
        if (lastEvenIX == firstEvenIx) {
            return -1;
        }
        return lastEvenIX - firstEvenIx;
    }


    static int diffEven1(int[] arr) {
        int result;
        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                firstIndex = i;
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                lastIndex = i;
            }
        }
        if (firstIndex != lastIndex) {
            result = lastIndex - firstIndex;
        } else {
            result = -1;
        }
        System.out.println(firstIndex + " " + lastIndex);
        return result;
    }
}