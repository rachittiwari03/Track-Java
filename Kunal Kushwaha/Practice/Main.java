package practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hey, What's your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Oh nice to meet to you " + name);
        System.out.println("What's your age " + name + " gandu");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Okay " + name + " now i stored your age in my database");
        System.out.println(name+" do you want to give any information related that will automatically help me to understand you more");
        String about = sc.nextLine();
        System.out.println("This will help me alot");
        System.out.println("Ok "+name+" let me check your basic maths");
        System.out.println("4+4=?");
        int answer = Integer.parseInt(sc.nextLine());
        if (answer==8) {
            System.out.println("Yes! great");
        } else {
            System.out.println("No work on your basics "+name);
        }
        System.out.println("ok tell me "+name);
        System.out.println("Do you love pornography");
        String user_ans = sc.next();
        if (user_ans.equalsIgnoreCase("yes")) {
            System.out.println("Oh yeah");
        } else {
            System.out.println("Bakchod ho ek dum");
        }
    }
}