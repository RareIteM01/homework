package com.example.university.PPJ12;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        String[][] arr = {
                {"Kenya", "Nairobi"}, {"Rwanda", "Kigali"},
                {"Gambia", "Banjul"}, {"Ghana", "Accra"},
        };
        Scanner s = new Scanner(System.in);
        String country = s.next();
        boolean isInArr = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0].equalsIgnoreCase(country)) {
                System.out.println(" capital " + arr[i][1]);
                isInArr = true;
            }
        }
        if (!isInArr) {
            System.out.println("Country could not be found in array");
        }
    }
}
