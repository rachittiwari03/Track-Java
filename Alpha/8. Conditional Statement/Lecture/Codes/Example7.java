import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        // Checking ternary operator

        /* int larger = (5>3)? 5:3;
           System.out.println(larger);
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();
        String type = ((num%2)==0)? "even":"odd";
        System.out.println(type);


    }
}
