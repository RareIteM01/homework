package com.example.university.PPJ13;

public class Task03 {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 2}, {3, 4, 8}, {2, 6, 8}, {1, 8, 5}};
        int maxRow = 0, maxCol = 0;
        int tmpSum = 0, maxSum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                tmpSum += arr[row][col];
            }
            if (tmpSum > maxSum) {
                maxSum = tmpSum;
                maxRow = row;
            }
            tmpSum=0;
        }
        maxSum=0;
        for (int col = 0; col < arr[0].length; col++) {
            for (int row = 0; row < arr.length; row++) {
                tmpSum += arr[row][col];
            }
            if (tmpSum > maxSum) {
                maxSum = tmpSum;
                maxCol = col;
            }
            tmpSum=0;
        }
        System.out.println(maxCol);
        System.out.println(maxRow);
    }
}
