package src;

public class Pattern4 {
    public static void main(String[] args) {

        /* Print half pyramid character pattern
           A
           BC
           DEF
           GHIJ

         */
        int n = 4;
        char ch = 'A';

        for (int line = 1; line <= n; line++) {

            for (int chars = 1; chars <= line; chars++) {

                System.out.print(ch);

                ch++;
            }
            System.out.println();

        }
    }
}
