package Kunal.thirdVideo;

import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {

//        Nested Switch Cases == switch case inside a switch case
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id");
        int empNO = sc.nextInt();
        System.out.println("Enter department");
        String department = sc.next();

        switch (empNO) {
            case 1:
                System.out.println("Rachit");
                break;
            case 2:
                System.out.println("Kathrin");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT");
                        break;

                    case "Managment":
                        System.out.println("Managment");
                        break;
                }
                break;

            default:
                System.out.println("Enter valid empLNO");
                break;
        }
    }
}
