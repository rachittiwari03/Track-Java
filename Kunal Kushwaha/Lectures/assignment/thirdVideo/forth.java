package Kunal.assignment.thirdVideo;

import java.util.Scanner;


public class forth {
    public static void main(String[] args) {
        // Area Of Isosceles Triangle
        // A = ½ × b × c × sin(α)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();
        System.out.println("Enter alpha");
        int a = sc.nextInt();
        double alpha = Math.toRadians(a);
        double area = 0.5 * b * c * Math.sin(alpha);
        System.out.println("area = " + area);


// There are two type of division float division and ont division

        /* float a = 7.0f;
           float b = 3.0f;
           int result = a / b;
           result will be 2.33 */

    }
}
