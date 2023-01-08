package src;

import java.util.Scanner;

public class Ex2_Print_from_1_to_n {
    public static void main(String[] args) {

        // Print number from 1 to n (user input)

        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        while (i<=n){
            System.out.print(i + " ");
            i++;
        }

    }
}
