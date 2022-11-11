import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        // Income tax calculator
        /*
        income<5L -> 0% tax
        income between 5-10L -> 20% tax
        income>10L -> 30% tax
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income p.a");
        double income = sc.nextDouble();
        double tax = 0;

        if (income<=500000){
            tax = 0;
            System.out.println("No tax");

        } else if(income>500000 && income<=1000000){
            tax = 0.2*income;
            System.out.println("You have to pay: 20% tax = "+ tax);

        } else{
            tax = 0.3*income;
            System.out.println("You have to pay: 30% tax = " + tax);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // ALTERNATE METHOD

    /*  double income = sc.nextDouble();
        double tax = 0;

        if (income<=500000){
            tax = 0;

        } else if(income>500000 && income<=1000000){
            tax = 0.2*income;

        } else {
            tax = 0.3 * income;
        }

        System.out.println("your tax is : " + tax);

     */

    }
}
