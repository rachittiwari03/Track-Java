package Kunal.secondVideo;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        System.out.println("Enter num3");
        int num3 = sc.nextInt();

        int max = num1;


        if (num2>max) {
            max = num2;
            if (num3>max) {
                max = num3;
            }
        }


        if (num1 == max) {
            if(num2>num3) {
                System.out.println("Second max is " + num2);
            } else System.out.println("second max " + num3);


        } else if (num2==max) {
            if (num1>num3) {
                System.out.println("second max is " + num1);
            } else System.out.println("Second max " + num3);


        } else if (num3 == max) {
            if(num1>num2) {
                System.out.println("second max " +num1);
            } else System.out.println("second max " + num2);
        }


        System.out.println("max num is " + max);


    }
}
