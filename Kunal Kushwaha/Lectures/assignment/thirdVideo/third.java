package Kunal.assignment.thirdVideo;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        // Area of Rectangle
        // area = w · h

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width");
        int w = sc.nextInt();
        System.out.println("Enter Height");
        int h = sc.nextInt();
        int area = w * h;
        System.out.println("Area = " + area + " sq cm");


    }
}
