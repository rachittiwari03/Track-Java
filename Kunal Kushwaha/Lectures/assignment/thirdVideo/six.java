package Kunal.assignment.thirdVideo;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        // Volume of Cone
        // volume = (1/3) · π · r2 · h

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the r & h");
        double h = sc.nextDouble();
        double r = sc.nextDouble();
        double volume =  0.33 * Math.PI * (r * r) * h;
        System.out.println(volume);
    }
}
