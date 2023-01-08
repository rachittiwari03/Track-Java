package src;

public class Ex8_ReverseNumber {
    public static void main(String[] args) {

        // Print reverse of a number (num = 10899)


        int n = 10899;     // given num

        while (n > 0){

            int lastDigit = n%10;     // we will get lastDigit

            System.out.print(lastDigit + " ");  // Print lastDigit

            n = n/10;   // Remove lastDigit
        }
        System.out.println();
    }
}
