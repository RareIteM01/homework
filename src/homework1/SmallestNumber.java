package homework1;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("input 3 numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a > c) {
            if (c > b) {
                System.out.println("The smallest number from: " + a + "  " + b + "  " + c);
                System.out.println("The smallest number is: " + b);
            } else {
                System.out.println("The smallest number from: " + a + "  " + b + "  " + c);
                System.out.println("The smallest number is: " + c);
            }
        } else {
            if (a > b) {
                System.out.println("The smallest number from: " + a + "  " + b + "  " + c);
                System.out.println("The smallest number is: " + b);
            }else{
                System.out.println("The smallest number from: " + a + "  " + b + "  " + c);
                System.out.println("The smallest number is: " + a);
            }
        }
    }
}
