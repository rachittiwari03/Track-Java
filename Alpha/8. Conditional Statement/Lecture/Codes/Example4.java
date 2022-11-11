import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        // print vote question using else if

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("adult: you can vote");
        } else if(age>=13 && age<18){
            System.out.println("teenager: you can't vote");
        } else {
            System.out.println("Child");
        }
    }
}
