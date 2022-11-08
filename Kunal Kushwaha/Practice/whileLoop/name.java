package practice.whileLoop;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {

//        int i = 1;
//        while(i<=100) {
//            System.out.println("We are verto");
//            i++;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting point");
        int a = sc.nextInt();
        System.out.println("Enter the end condition");
        int b = sc.nextInt();
        int i = a;
        while (i <= b) {
            System.out.println("We are verto");
            i++;
        }
    }
}
