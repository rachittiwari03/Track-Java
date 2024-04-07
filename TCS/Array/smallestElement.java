//Find the smallest element in an array

import java.util.*;

class r1{
    public static void main(String args[]){
    int a[] = {100, 23, 45, 32, 76};
    int min = 5432;
    
    for(int i=0; i<a.length; i++){
        if(a[i]<min){
            min = a[i];
        }
    } 
    System.out.println(min);
}
}