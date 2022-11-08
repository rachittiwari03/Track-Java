package Kunal.assignment.secondVideo;

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
//      calculate Fibonacci Series up to n numbers.

        Scanner sc = new Scanner(System.in);
        int a = -1, b = 1, c, i;
        System.out.println(a+" "+b);
        System.out.println("Enter the fibonacci series limit");
        int limit = sc.nextInt();
        for (i=2; i<limit; i++) {
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
    }
}
