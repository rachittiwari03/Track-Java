import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

        // Use switch statement

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter between 1, 2, 3 & 4");
        int ch = sc.nextInt();
        switch (ch){
            case 1 :
                System.out.println("Block 32");
                break;
            case 2 :
                System.out.println("Block 34");
                break;
            case 3 :
                System.out.println("Block 36");
                break;
            case 4 :
                System.out.println("Block 38");
                break;

        }

    }
}
