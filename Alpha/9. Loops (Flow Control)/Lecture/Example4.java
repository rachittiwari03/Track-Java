package src;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        /*
        Sum of first n natural numbers
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
