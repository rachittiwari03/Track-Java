// Third largest using sorting

import java.util.*;

class n1{
    public static void main(String args[]){
        int a[] = {1,2,44,5,26,80,9};
        
        Arrays.sort(a);
        
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println();
        System.out.println(a[a.length-2]);
        
    }
}