package Kunal.firstVideo;

import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temp in C: ");

        float tempC = sc.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println("Temperature in F is " +tempF);
    }
}

