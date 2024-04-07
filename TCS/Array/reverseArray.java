// Reverse an given array

import java.util.*;
class c1 {
    public static void main(String args[]) {
        int a[] = {1, 3, 4, 5, 6, 7};
        int b[] = new int[6];
        int l = a.length;

        for(int i = l - 1; i >= 0; i--) {
            b[l - i - 1] = a[i];
        }

        for(int i = 0; i < l; i++) {
            System.out.println(b[i]);
        }
    }
}