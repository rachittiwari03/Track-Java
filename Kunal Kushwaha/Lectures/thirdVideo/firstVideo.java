package Kunal.thirdVideo;

import java.util.Scanner;

public class firstVideo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bed no");
        int room = sc.nextInt();

//        Old Way
//
//        switch (room) {
//            case 1:
//                System.out.println("Robin Thakur");
//                break;
//
//            case 2:
//                System.out.println("Ashrit Athwale");
//                break;
//
//            case 3:
//                System.out.println("Chetan Kandpal");
//                break;
//
//            case 4:
//                System.out.println("Rachit");
//                break;
//
//            default:
//                System.out.println("Enter a valid number");
//                break;
//        }

//        Enhanched WAY

        switch (room) {
            case 1 -> System.out.println("Robin Thakur");
            case 2 -> System.out.println("Ashrit Athwale");
            case 3 -> System.out.println("Chetan Kandpal");
            case 4 -> System.out.println("Rachit");
            default -> System.out.println("Enter a valid number");
        }
    }
}
