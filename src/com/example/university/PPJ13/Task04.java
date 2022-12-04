package com.example.university.PPJ13;

public class Task04 {
    public static void main(String[] args) {
        int[][] a = {{4, 9, 10, 0, 1, 2},
                {7, -8, 20, 1, 5, 8},
                {1, 8, 3, 2, 1, -3},
                {1, 8, -3, 2, 11, -3},
                {17, 0, 5, -9, 21, 10}};
        printArr(a, "Original matrix");
        setZeros(a);
        printArr(a, "Zeroing rows and columns containing zero");
    }

    public static void setZeros(int[][] arr) {
        int[] columnsToZero = new int[arr[0].length];
        int[] rowsToZero = new int[arr.length];
        int rowIx = 0, colIx = 0;
        for (int i = 0; i < columnsToZero.length; i++) {
            columnsToZero[i] = -1;
        }
        for (int i = 0; i < rowsToZero.length; i++) {
            rowsToZero[i] = -1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    columnsToZero[colIx] = j;
                    rowsToZero[rowIx] = i;
                    colIx++;
                    rowIx++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int cols = 0; cols < columnsToZero.length; cols++) {
                    if(columnsToZero[cols]!=-1){
                        if(j==columnsToZero[cols]){
                            arr[i][j]=0;
                        }
                    }
                }
                for (int rows = 0; rows < rowsToZero.length; rows++) {
                    if(rowsToZero[rows]!=-1){
                        if(i==rowsToZero[rows]){
                            arr[i][j]=0;
                        }
                    }
                }

            }
        }
    }

    public static void printArr(int[][] arr, String message) {
        System.out.println(message);
        for (int [] a:arr){
            for (int b:a)
                System.out.print(b+" ");
            System.out.println();
        }
    }
}
