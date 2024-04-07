//Rearrange array in increasing-decreasing order

import java.util.*;

class r1{
    public static void main(String args[]){
        int a[] = {8, 7, 1, 6, 5, 9};
        
        Arrays.sort(a);
        
        for(int i=0; i<a.length-3; i++){
        System.out.print(a[i]);
        }
        
        for(int i=a.length-1; i>=a.length-3; i--){
        System.out.print(a[i]);
        }
    }
}
