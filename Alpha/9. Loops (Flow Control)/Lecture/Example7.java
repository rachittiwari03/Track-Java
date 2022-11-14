package src;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        /*
        Print reverse of number
        example 10899 --- 99801
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num you want to reverse");
        int num = sc.nextInt();

        while ( num > 0){
            int lastdigit = num % 10;
            System.out.print(lastdigit);
            num = num/10; // n/=10
        }
       // Sy
    }
}
