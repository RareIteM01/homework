package com.example.university.ppj11;

public class Task03AlignSquare {

    public static void main(String[] args) {
        printAlignRight();
        System.out.println();
        printAlignLeft();
        System.out.println();
        printAlignLeft2();
    }

    //  0 1 2 3
    //0 * * * *
    //1   * * *
    //2     * *
    //3       *
    private static void printAlignRight() {
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (row <= col) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    // * * * *
    // * * *
    // * *
    // *
    private static void printAlignLeft() {
        for (int row = 0; row < 4; row++) {
            for (int size = 0; size < 4 - row; size++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    private static void printAlignLeft2() {
        for (int row = 0; row < 4; row++) {
            for (int size = 0; size < 4; size++) {
                if (size < 4 - row) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
