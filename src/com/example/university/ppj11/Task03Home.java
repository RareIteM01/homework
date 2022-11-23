package com.example.university.ppj11;

public class Task03Home {
    public static void main(String[] args) {
         int [] array = {1, 5, 8, 2, 6};
         int max = array[0];
         for (int i = 0; i < array.length; i ++){
             if (max < array[i]){
                 max = array [i];
             }
         }
         for (int row = max; row > 0; row --){
             for (int i = 0; i < array.length; i ++){
                 if (row <= array[i]){
                     System.out.print("*");
                 }else{
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
    }
}
