package Kunal.secondVideo;

public class countingOccurence {
    public static void main(String[] args) {
        //if there is a number eg - 12345678543
        // We have to find how many times '3' occured
        // We have to check every digit

        int n = 45536;

        int count = 0;
        while (n>0) {
            int rem = n%10;
            if (rem == 5) {
                count++;
            }
            n = n / 10; // n/= 10
        }
        System.out.println(count);
    }
}
