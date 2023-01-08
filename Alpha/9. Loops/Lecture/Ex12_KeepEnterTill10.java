package src;

import java.util.Scanner;

public class Ex12_KeepEnterTill10 {
    public static void main(String[] args) {

        // Keep entering numbers till users enters a multiple of 10

        Scanner sc = new Scanner(System.in);
        do{
            int n = sc.nextInt();
            if (n % 10 == 0){
                break;
            }
            System.out.println(n);
        }while (true);
    }
}
