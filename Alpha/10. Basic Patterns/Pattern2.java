package src;

public class Pattern2 {
    public static void main(String[] args) {

        /* Ques: Inverted Star Pattern
           * * * *
           * * *
           * *
           *

       */

        int n = 5;

        for(int line = 1; line <= 5; line++){

            for(int star = 1; star <= (n - line + 1); star++){

                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
