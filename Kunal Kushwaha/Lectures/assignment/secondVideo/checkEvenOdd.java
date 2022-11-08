package Kunal.assignment.secondVideo;

import java.util.Scanner;

public class checkEvenOdd {
    public static void main(String[] args) {

//      Write a program to print whether a number is even or odd, also take input from the user.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to check");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.println("Even");
        } else System.out.println("Odd");
    }
}
