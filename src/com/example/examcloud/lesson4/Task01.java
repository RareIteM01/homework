package com.example.examcloud.lesson4;


import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        int number;
        System.out.println("input the number");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if (number % 2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number in not even");
        }
    }
}
