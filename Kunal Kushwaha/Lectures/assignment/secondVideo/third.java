package Kunal.assignment.secondVideo;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {

//  Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your P");
        int p = sc.nextInt();
        System.out.println("Enter your t");
        int t = sc.nextInt();
        System.out.println("Enter your r");
        int r = sc.nextInt();
        int interest = (p*r*t)/100;
        System.out.println("interest = " + interest);
        int finalAmount = interest + p;
        System.out.println("final amount = " + finalAmount);


    }
}
