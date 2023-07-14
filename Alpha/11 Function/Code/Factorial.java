package src;

import java.util.Scanner;

public class Factorial {

    public static void factorial(int num){
        int f = 1;
        for (int i = 1; i <=num ; i++) {
            f = f * i;
        }
        System.out.println(f);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num");
        int num = sc.nextInt();
        factorial(num);

    }
}
