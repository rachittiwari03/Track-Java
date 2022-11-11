package src;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        /*
        Question 5 : Write a Java program that takes a year from the user and print whether that
                     year is a leap year or not
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year you want to check");
        int year = scanner.nextInt();

        if (year % 4 == 0){
            System.out.println("Leap year");

        } else if (year % 100 == 0){
            System.out.println("Leap year");

        } else if (year % 400 == 0){
            System.out.println("laep year");

        } else {
            System.out.println("Not a leap year");
        }
    }
}
