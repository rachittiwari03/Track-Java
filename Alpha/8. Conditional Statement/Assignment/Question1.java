import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        /*
        Question 1 : Write a Java program to get a number from the user and print whether it is
                     positive or negative.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        float num = sc.nextFloat();
        if (num>1){
            System.out.println("Given num is +ve");
        } else {
            System.out.println("Given num is -ve");
        }
    }
}
