import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        // Print the larger from 2 given number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 & num2");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1>=num2){
            System.out.println("larger: "+ num1);
        }
        else {
            System.out.println("larger: "+ num2);
        }

    }
}
