package Kunal.assignment.thirdVideo.intermediateJavaProgram;

import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int num = sc.nextInt();
        while (num>0) {
            sum = sum + num;
            num = sc.nextInt();

            if (num == 0) {
                break;
            }
        }
        System.out.println(sum);


    }
}
