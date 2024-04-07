//Find the largest element in an array

import java.util.*;

class largest{
    public static void main(String args[]){
        int a[] = {67, 323, 45, 423, 323, 65};
        int max = -4;
        
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("max " + max);
    }
}
