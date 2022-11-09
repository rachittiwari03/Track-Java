import java.util.Scanner;

public class question_2 {
    public static void main(String[] args) {

        /*
        Question 2: In a program, input the side of a square. You have to output the area of the
                     square.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square");
        int side = sc.nextInt();
        int area = (side*side);
        System.out.println("Area of given square is "+ area);


    }
}
