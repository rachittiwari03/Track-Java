package Kunal.assignment.thirdVideo;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        // Area of a Circle

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius in centi-meter");
        int radius = sc.nextInt();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("area =" + area + " centi-meter");

    }
}
