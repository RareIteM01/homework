package com.example.university.PPJ10;

public class Task01 {
    public static void main(String[] args) {
        double arr[]=new double[10];
        for (int i=0;i<arr.length;i++){
            arr[i]=Math.random()*10;
        }
        //print all values of array
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //print all values under even indexes
        for (int i=0;i<arr.length;i+=2){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //print values which are odd (cast to int)
        for (int i=0;i<arr.length;i++){
            if(((int)arr[i])%2!=0) System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
