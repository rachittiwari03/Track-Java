package src;

public class Pattern3 {
    public static void main(String[] args) {

        /* Half Pyramid structure
           1
           12
           123
           1234
         */

        for (int i = 1; i <=4; i++) {        // Outer loop for no of lines
            for (int j = 1; j <= i; j++) {   // Inner loop for whatever we have to print in lines
                System.out.print(j);         // what we have to print
            }
            System.out.println();            // for next line
        }
    }
}
