package com.example.university.ppj09;

import java.util.Scanner;

public class PPJ09_Task3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        byte v=s.nextByte();

        char hex=' ';
        if(v<=9){
            hex = (char)('0'+v);
        }else{
            hex = (char)('A'+v%10);
        }
        System.out.println(hex);
    }
}
