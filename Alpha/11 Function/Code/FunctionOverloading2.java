package src;

public class FunctionOverloading2 {

    // Function Overloading using data types

    public static int sum(int a, int b) {
        return a+b;
    }

    public static float sum(float a, float b) {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(8,9));
        System.out.println(sum(4.4f, 6.6f));
    }
}
