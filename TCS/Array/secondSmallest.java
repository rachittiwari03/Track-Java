//Find the second smallest element in an array

import java.util.*;
class r1{
    public static void main(String args[]){
        int a[] = {32, 434, 54, 23, 534};
        
        int min = 5433;
        int secMin = 32;
        
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                secMin = min;
                min = a[i];
            }
        }
        System.out.println("min " + min);
        System.out.println("secMin " + secMin);
    }
}