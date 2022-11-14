package src;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        // sum of n natural number using for loop

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
