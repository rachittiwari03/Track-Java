//Remove duplicates from a sorted array

import java.util.*;

class r1{
    public static void main(String args[]){
        int a[] = {1,3,4,5,6,5,4,5};
        int b[] = new int[8];
        
         
        Arrays.sort(a);
        b[0] = a[0];
        int pos = 1;
        
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        
        for(int i=0; i<a.length-1; i++){
            if(a[i] != a[i+1]){
            b[pos] = a[i];
            pos++;
        }
        
        if(a[a.length-1] != a[a.length-2])
        b[pos] = a[a.length-1];
    }
    for(int i=0; i<b.length; i++){
    System.out.println(b[i]);
    }
}
}