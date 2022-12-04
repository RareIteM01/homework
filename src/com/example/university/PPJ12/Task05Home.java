package com.example.university.PPJ12;

public class Task05Home {
    public static void main(String[] args) {
        int[][][] opers = {
                {{100, -50, 25}, {150, -300}, {300, -90, 100}},
                {{90, -60, 250}, {300, 20, -100}},
                {{20, 50}, {300}, {20, -20, 40}, {100, -200}},
        };
        int sum = 0;
        for (int customer = 0; customer < opers.length; customer++) {
            for (int account = 0; account < opers[customer].length; account++) {
                for (int depExpenses = 0; depExpenses < opers[customer][account].length; depExpenses++) {
                    sum += opers[customer][account][depExpenses];
                }
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
