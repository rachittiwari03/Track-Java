package Kunal.assignment.thirdVideo;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        // Area of equilateral triangle
        // Area =  (√3/4)a2

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side");
        double a = sc.nextInt();
        double area =Math.sqrt(3)/4 * (a * a);
        System.out.println(area);
    }
}
