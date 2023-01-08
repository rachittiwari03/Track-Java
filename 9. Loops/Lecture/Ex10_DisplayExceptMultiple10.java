package src;

import java.util.Scanner;

public class Ex10_DisplayExceptMultiple10 {
    public static void main(String[] args) {

        // Display all numbers entered by users except multiples of 10

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter your num");
            int n = sc.nextInt();

            if (n%10 == 0){
                continue;
            }
            System.out.println("num was: " + n);
        } while (true);
    }
}
