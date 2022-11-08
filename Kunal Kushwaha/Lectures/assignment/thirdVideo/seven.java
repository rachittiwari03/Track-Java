package Kunal.assignment.thirdVideo;

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        // Given an integer number n, return the difference between the product of its digits and the sum of its digits.
        // leet code problem

        int sum = 0;
        int product = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();

        while(n > 0){
            sum += n % 10;  // for example --> 123 % 10 == 3
            product *= n % 10;
            n = n / 10; // for example --> 123 / 10 = 12
        }
        int difference = product - sum;
        System.out.println("Product = "+ product);
        System.out.println("Sum = "+ sum);
        System.out.println("Difference = " + difference);

    }
}
