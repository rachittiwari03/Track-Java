package src;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        /*
        Print number 1 to n using while loop
         */

        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int i = 1;
        while (i <= range){
            System.out.print(i + " ");
            i = i + 1;
        }
    }
}
