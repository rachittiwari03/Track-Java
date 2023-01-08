package src;

import java.util.Scanner;

public class Ex6_PrintSumOf_nNatural {
    public static void main(String[] args) {

        // Print the sum of n natural numbers

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
