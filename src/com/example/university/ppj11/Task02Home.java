package com.example.university.ppj11;

public class Task02Home {
    public static void main(String[] args) {
        int[] array = {3, 3, 39, 8, 6, 38, 7, 10, 5};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max - min);

        int minIndex = array[0]; // todo придумать пример когда этот код не правильно находится максимальный и минимальный элемент
        int maxIndex = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " , ");
        }
        System.out.println();
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " , ");
        }
    }
}

