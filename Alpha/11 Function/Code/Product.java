package src;

import java.util.Scanner;

public class Product {

    public static void product(int a, int b ){
        int multiply = a * b;
        System.out.println("Product of a & b is "+ multiply);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        product(a,b);
    }
}
