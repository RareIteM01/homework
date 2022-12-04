package com.example.university.PPJ10;

public class Task02 {
    public static void main(String[] args) {
        char [] array = {'a', '0', '2'};
        int index = 0;
        for (int i = 1; i < array.length; i ++) {
            if (array [i] < array[index]) {
                index = i;
            }
        }

        for (int i=0;i <array.length;i++){
            System.out.println((int)array[i]);
        }
        System.out.println(index);
    }
}
