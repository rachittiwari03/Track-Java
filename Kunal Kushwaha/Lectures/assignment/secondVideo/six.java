package Kunal.assignment.secondVideo;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {

//       Input currency in rupees and output in USD.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in rupees");
        int input = sc.nextInt();
//        1 dollar = 79.37 rupees
        System.out.println(input/79.37);
    }
}
