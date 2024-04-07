// Median of a  given array

import java.util.*;
class c1 {
    public static void main(String args[]) {
        int a[] = {1, 3, 4, 5, 6};
        int median = 0;
        int l = a.length;

       if(l%2 == 0){
           int f = l/2;
           int s = f -1;
           median = (a[f] + a[s]) / 2;
       }else {
           median = a[l/2];
       }
       System.out.println(median);
    }
}