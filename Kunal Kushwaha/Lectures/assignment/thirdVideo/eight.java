package Kunal.assignment.thirdVideo;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        // Input a number and print all the factors of that number (use loops).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        for (int n = 1; n <=n ; n++) { // This for loop start running form 1 to the number itself
            if (num % n == 0) {       // and check is num % n == 0 (remainder = 0 or not. If rem = 0 print that number)
                System.out.println(n);
            }
        }
    }
}
