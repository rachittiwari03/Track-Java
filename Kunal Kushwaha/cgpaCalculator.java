import java.util.Scanner;

public class cgpaCalculator {
    public static void main(String[] args) {

        // This is my personal cgpa calculator

        Scanner sc = new Scanner(System.in);
        double a,b,c,d;
        a = 6.16;
        b = 6.00;
        c = 6.76;
        d = 7.12;
        System.out.println("Enter the 5th Sem expected cgpa");
        double e = sc.nextDouble();
        double add = a+b+c+d+e;
        double aggregate_cgpa = add/5;
        System.out.println(a+b+c+d);
        System.out.println("Your aggregate_cgpa will be = " + aggregate_cgpa);
    }
}
