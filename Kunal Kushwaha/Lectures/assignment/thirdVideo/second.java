package Kunal.assignment.thirdVideo;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        // Area of Triangle

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter breadth");
        int b = sc.nextInt();
        System.out.println("Enter height");
        int h = sc.nextInt();

        double area = 0.5 * (b * h);
        System.out.println("area =" + area);
    }
}
