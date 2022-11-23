package com.example.university.ppj11;

public class Task02 {
    public static void main(String[] args) {
        int[] array = {3, 30, 5, 8, 6, 2, 7, 10, 28};
        int max = array[0];
        int min = array[0];
        for (int a = 0; a < array.length; a++) {
            if (array[a] < min) min = array[a];
            if (array[a] > max) max = array[a];
        }
        System.out.println(max - min);

        int minIndex = 0;
        int maxIndex = 0;
        for (int a = 0; a < array.length; a++) {
            if (array[a] < array[minIndex]) minIndex = a;
            if (array[a] > array[maxIndex]) maxIndex = a;
        }
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " , ");
        }
        System.out.println();
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " , ");
        }
    }
}
