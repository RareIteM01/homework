package com.example.university.PPJ13;

import java.util.Arrays;

public class Task02 {
    static int[][] trans(int[][] arr) {
        int[][] res = new int[arr[0].length][arr.length];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                res[col][row] = arr[row][col];
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
        for (int[] r : trans(a)) {
            System.out.println(Arrays.toString(r));
        }
    }
}
