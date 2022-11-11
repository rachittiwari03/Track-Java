import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        // Print the largest from 3 given number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1, num2 & num3");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("Largest: "+ num1);
        } else if(num2>num3){
            System.out.println("Largset: "+ num2);
        } else{
            System.out.println("Largset: "+ num3);
        }

    }
}
