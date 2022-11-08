package Kunal.assignment.thirdVideo.intermediateJavaProgram;

import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        // Take integer inputs till the user enters 0 and print the largest number from all.

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();
        while (num > 0) {
            sum = sum + num;
            num = sc.nextInt();

            if (num == 0) {
                break;
            }
        }

    }
}
