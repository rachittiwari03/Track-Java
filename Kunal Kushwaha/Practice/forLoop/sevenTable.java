package practice.forLoop;

import java.util.Scanner;

public class sevenTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Which table you want");
        int a = sc.nextInt();
        System.out.println("Till");
        int b = sc.nextInt();
        for(int i = b; i>= 1; i--) {
            System.out.println(a + " * " + i + " = " + i * a);
        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Which table you want");
//        int a = sc.nextInt();
//        System.out.println("Till");
//        int b = sc.nextInt();
//        for(int i = 1; i<= b; i++) {
//            System.out.println(a + " * " + i + " = " + i * a);
//        }

    }
}
