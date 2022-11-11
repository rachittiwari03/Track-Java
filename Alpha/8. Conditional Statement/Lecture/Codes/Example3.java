import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        // Print if a given num is even or odd

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.println("Given num: even");
        }
        else{
            System.out.println("Given num: odd");
        }
    }
}
