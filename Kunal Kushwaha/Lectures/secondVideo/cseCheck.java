package Kunal.secondVideo;

import java.util.Scanner;

public class cseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if (ch >= 'a' && ch<= 'z') {    // Here, if is checking the condition with the help of "value of a to value of z" (through ascai value)
            System.out.println("Lower case");
        } else {
            System.out.println("Upper case");
        }
        System.out.println(ch);
    }
}
