package src;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        /*
        Question 2 : Finish the following code so that it prints You have a fever if your temperature
                     is above 100 and otherwise prints You don't have a fever.

                     public class Solution {
                        public static void main(String[] args) {
                        double temp = 103.5;
                          }
                       }
         */

        double temp = 103.5;
        if (temp>100){
            System.out.println("you have fever");
        } else {
            System.out.println("you don't have fever");
        }

    }
}
