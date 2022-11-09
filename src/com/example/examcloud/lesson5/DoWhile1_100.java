package com.example.examcloud.lesson5;


import java.util.Scanner;

public class DoWhile1_100 {
    public static void main(String[] args) {
        runVariantScannerExampleWhileDo();
    }

    private static void runVariant1() {
        int number = 1;
        do {
            if (number % 5 == 0) {
                System.out.println("number = " + number);
            }
            number++;
        } while (number <= 100);
    }

    private static void runVariant2() {
        int number = 5;
        do {
            System.out.println("number = " + number);
            number += 5;
        } while (number <= 0);
    }

    private static void runVariantWhileDo() {
        int number = 5;
        while (number <= 0) {
            System.out.println("number = " + number);
            number += 5;
        }
    }

    private static void runVariantScannerExampleInt() {
        Scanner scan = new Scanner(System.in);
        int number;
        do {
            System.out.println("Put the value");
            number = scan.nextInt();
        } while (number != 9);
    }

    private static void runVariantScannerExampleString() {
        Scanner scan = new Scanner(System.in);
        String number;
        do {
            System.out.println("Put the value");
            number = scan.nextLine();
        } while (!number.equals("exit"));
    }
    private static void runVariantScannerExampleWhileDo() {
        Scanner scan = new Scanner(System.in);
        String number;
        System.out.println("Put the value");
        number = scan.nextLine();
        while (!number.equals("exit")) {
            System.out.println("Put the value");
            number = scan.nextLine();
        }
    }
}
// Задание: удалить 61 и 60, 57, 58, посмоотреть как меняется выполнение програмы.

// 1.  если убрать 61 строку программа будет печатать "Put the value" бесконечно. То есть не будет проверки введенного числа.

// 2.  Если убрать 57 строку ничего не изменится, строка используется просто для того чтоб уазать польлзователю заать число или слово.

// 3.  Если убрать 60 мтроку то к концце действия пользователся просто не будет надписи "Put the value", функция программы не измнится.

// 4.  Если убрать 55 строку то выдаст ощибку компиляции и программа просто не запустится.

// 5.  Если убрать переменную String программа не будет расспозновать дальнейшие дейсвтия с этим типом переменной
//     так как в коде её просто не существует.
// 6.  Если убрать условие с 59-61 строку то программа после любого введённого символа завершится.