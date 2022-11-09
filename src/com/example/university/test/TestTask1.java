package com.example.university.test;

public class TestTask1 {
    public static void main(String[] args) {
        int size = 10;
        for(int i = 0; i < size; i++){
            int j = i;
            do{
                j += i;
                System.out.println(j);
            }while( j < i);
        }

    }
}
