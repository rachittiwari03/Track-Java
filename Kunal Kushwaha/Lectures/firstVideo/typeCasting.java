package Kunal.firstVideo;

public class typeCasting {
    public static void main(String[] args) {

        //type casting
        int num = (int)(65.55f);
        System.out.println(num);

        // automatic type promotion in expressions
        int a = 267;
        byte b = (byte)(a);
        System.out.println(b);

        int q = 257;
        byte p = (byte)(q);
        System.out.println(p); // 257 % 256 = 1

        byte w = 40;
        byte e = 50;
        byte r = 100;
        int t = (w * e) / r; // This perform using integer even they are in byte. They excedes its value.
        System.out.println(t);

        int number = 'a';
        System.out.println(number);
    }
}
