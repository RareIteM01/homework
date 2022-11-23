package com.example.university.ppj11;

public class Task03Teacher {
// * * *
// * * *
//   * *
//   * *
//   *
//   *
    public static void main(String[] args) {
        int[] array = {2, 6, 4};
        int max = array [0];
        for (int col = 0; col < array.length; col ++) {
            if (max < array[col]) {
                max = array[col];
            }
        }
//        System.out.println(max);

       for (int row = 0; row <3; row ++) {
//           System.out.println(" * * * * * * * * * * ");
       }
//       for (int row = 0; row < 4; row ++) {
//           int col = 0;
//           do {
//               col ++;
//               System.out.print(" * ");
//           }while (col <= row);
//           System.out.println();
//       }
        for (int row = 0; row < 4; row ++) {
            int size = 0;
            do {
                size ++;
                System.out.print(" * ");
            }while (size < 4 - row);
            System.out.println();
//            row = 0, size = 4
//            row = 1, size = 3
//            row = 2, size = 2
//            size = 4 - row
        }
    }
}
//* * * *
//  * * *
//    * *
//      *
//