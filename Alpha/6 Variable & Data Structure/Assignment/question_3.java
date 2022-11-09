import java.util.Scanner;

public class question_3 {
    public static void main(String[] args) {

        /*
        Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
        an eraser. You have to output the total cost of the items back to the user as their bill.
        (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of the pencil");
        float pencil = sc.nextFloat();

        System.out.println("Enter the price of the pen");
        float pen = sc.nextFloat();

        System.out.println("Enter the price of the eraser");
        float eraser = sc.nextFloat();

        float total = (pen+pencil+eraser);
        System.out.println("Total cost is " + total);

        double total2 = (total+18.0/100.0*total);
        System.out.println("Total cost include 18% gst is "+ total2);

    }
}
