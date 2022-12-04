package com.example.university.PPJ12;

public class Task02Home {
    public static void main(String[] args) {
        int[] a = {-1, 2, 6, 3, -3, 2, 9};
        examplePrintEven(a);
        System.out.println();
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " , ");
        }
        System.out.println(a[a.length - 1]);
        exchangeValues(a);
//        todo repeat output array without last comma
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " , ");
        }
        System.out.println(a[a.length - 1]);
        System.out.println(numOdd(a));
         int [] result = getMinMaxIndex(a);
        System.out.println("minIndex = " + result[0]);
        System.out.println("maxIndex = " + result[1]);
    }

    private static int numOdd(int[] a) {
        int counter = 0;
        for (int el : a) {
            if (el % 2 != 0) counter++;
        }
        return counter;
    }

    private static int[] getMinMaxIndex(int[] arr) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }
        int[] result = {minIndex, maxIndex};
        return result;
    }

    private static void examplePrintEven(int[] a) {
        for (int i = 1; i <= 5; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            } else {
                System.out.print(" ! ");
            }
        }
    }

    private static void exchangeValues(int[] array) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[minIndex] > array[i]) {
                minIndex = i;
            }
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;
    }
}
