package com.example.examcloud.lesson5;

public class CycleWhile {
    public static void main(String[] args) {
        int task01 = 1;
        while (task01 > 0 && task01 <= 10) {
            System.out.println("task0" + task01++);
        }
    }
}
