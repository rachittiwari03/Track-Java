package Kunal.assignment.secondVideo;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {

//      Take 2 numbers as input and print the largest number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        if (num1>num2) {
            System.out.println("num1 is greater");
        } else System.out.println("num2 is greater");

    }
}
