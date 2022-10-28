package com.example.examcloud.university;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int day = s.nextInt();
        int month = s.nextInt();

        int amountOfDays=0;

        for (int m=1;m<month;m++){
            if(m==2){
                amountOfDays+=28;
            }else if(m==4 || m==6 || m==9 || m==11){
                amountOfDays+=30;
            }else{
                amountOfDays+=31;
            }
        }
        amountOfDays+=day;
        System.out.println(amountOfDays);
    }
}
