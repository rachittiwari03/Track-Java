package src;

public class FunctionOverloading {

    /* function overloading - using parameters or using data types.
       function overloading - multiple function with same name but different parameters
       not depend on returnType only depend upon parameters. */

    public static int sum(int a, int b) {
        return a+b;
    }

    public static int sum(int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(8,9));
        System.out.println(sum(4, 6, 7));
    }
}
