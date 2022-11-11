import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        /* We have to check if a student will pass or fail
        marks>=33 -> pass
        marks<=33 -> fail
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        float marks = sc.nextFloat();
        if (marks>=33){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

    }
}
