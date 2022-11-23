package com.example.university.ppj11;

public class Task04 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i-1] = array[i];
            for ( int j = 0; i < array.length; j++) {
                System.out.println(array[j]+ " ");
            }
            System.out.println();
        }
        array[array.length-1]=temp;
        for ( int j = 0; j < array.length; j++){
            System.out.print(array[j]+ " ");
        }
        System.out.println();
    }
}
