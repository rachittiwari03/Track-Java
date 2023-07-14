package src;

public class PrintPrimeInRange {

    public static void primesInRange(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primesInRange(100);
    }
}
