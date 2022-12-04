package com.example.university.PPJ12;

public class Task05 {
    public static void main(String[] args) {
        int[][][] opers = {
                {{100, -50, 25}, {150, -300}, {300, -90, 100}},
                {{90, -60, 250}, {300, 20, -100}},
                {{20, 50}, {300}, {20, -20, 40}, {100, -200}},
        };
        int sum = 0;
        for (int cust = 0; cust < opers.length; cust++) {
            for (int acc = 0; acc < opers[cust].length; acc++) {
                for (int op = 0; op < opers[cust][acc].length; op++) {
                    sum += opers[cust][acc][op];
                }
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
