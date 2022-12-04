package com.example.university.PPJ12;

public class Task03 {
    public static void main(String[] args) {
        int[] a = {-1, 9, 3, 0, -3, 2, 4};
        System.out.print("array: ");
        printArr(a);
        System.out.println(" odd: " + numOdd(a));
        System.out.println("even: " + numEven(a));

        int[] indexMinMax = getMinMaxIndex(a);
        System.out.println("Index of min: " + indexMinMax[0]);
        System.out.println("Index of max: " + indexMinMax[1]);

        int[][] res = getOddEven(a);
        System.out.print(" odd elements: ");
        printArr(res[0]);
        System.out.print("even elements: ");
        printArr(res[1]);
    }

    private static int[][] getOddEven(int[] a) {
        int[] odd = new int[numOdd(a)];
        int[] even = new int[numEven(a)];
        int oddIx = 0, evenIx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even[evenIx++] = a[i];
            } else odd[oddIx++] = a[i];
        }
        int[][] result = {odd, even};
        return result;
    }

    private static int[] getMinMaxIndex(int[] a) {
        int minIx = 0, maxIx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[minIx]) minIx = i;
            if (a[i] > a[maxIx]) maxIx = i;
        }
        int[] result = {minIx, maxIx};
        return result;
    }

    private static int numEven(int[] a) {
        int counter = 0;
        for (int el : a) {
            if (el % 2 == 0) counter++;
        }
        return counter;
    }

    private static int numOdd(int[] a) {
        int counter = 0;
        for (int el : a) {
            if (el % 2 != 0) counter++;
        }
        return counter;
    }

    private static void printArr(int[] a) {
        System.out.print("[ ");
        for (int el : a) System.out.print(el + " ");
        System.out.println("]");
    }
}
