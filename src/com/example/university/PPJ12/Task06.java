package com.example.university.PPJ12;

import java.util.Arrays;

public class Task06 {


    static int[][] inner(int[][] arr) {
        int[][] res = new int[arr.length - 2][arr[0].length - 2];

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = arr[i + 1][j + 1];
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 6, 7},
                {3, 4, 5, 6, 7, 8},
                {4, 5, 6, 7, 8, 9}};
        for (int[] r : a) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println();
        for (int[] r : inner(a)) {
            System.out.println(Arrays.toString(r));
        }
    }
}

