import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        // First example from 1st video

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("adult: drive, vote");
        }

        if (age > 13 && age < 18) {
            System.out.println("teenager");
        }

        else{
            System.out.println("not adult");
        }

    }
}
