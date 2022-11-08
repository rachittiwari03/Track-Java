package Kunal.assignment.secondVideo;

import java.util.Scanner;

public class forth {
    public static void main(String[] args) {

        // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        System.out.println("Enter operation you want to perform (add = +, 2 = -, 3 = *, 4 = /)");
        int operation = sc.nextInt();

        if (operation == 1) {
            System.out.println(num1+num2);
        } else if (operation == 2) {
            System.out.println(num1-num2);
        } else if (operation == 3) {
            System.out.println(num1*num2);
        } else System.out.println(num1/num2);

    }
}
