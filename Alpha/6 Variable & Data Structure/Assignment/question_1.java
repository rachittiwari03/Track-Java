import java.util.Scanner;

public class question_1 {
    public static void main(String[] args) {

        /* Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
                     these 3 numbers. */


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three num1, num2, & num3");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int average = (num1+num2+num3)/3;
        System.out.println("Average of give number is " + average);
    }
}
