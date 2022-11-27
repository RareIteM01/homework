package com.example.university.ppj11;

public class Task03HomeArrays {
    public static void main(String[] args) {
        int[] array = {2, 6, 4};
        int max = array[0];
        for (int col = 0; col < array.length; col++) {
            if (max < array[col]) {
                max = array[col];
            }
        }
        for (int row = 6; row > 0; row--) {
           for (int col = 0; col < array.length; col++) {
                if (array[col] >= 7 - row) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
// * * *
// * * *
//   * *
//   * *
//   *
//   *