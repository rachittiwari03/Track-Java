//Find the second largest element in an array

import java.util.*;

class r1{
public static void main(String args[]){
    
    int a[] = {32, 45, 543, 43, 2, 1};
    int max = -5;
    int secondMax = -5;
    
    for(int i=0; i<a.length; i++){
        if(a[i]>max){
            secondMax = max;
            max = a[i];
            }
        }
        System.out.println("max " + max);
        System.out.println("secondMax " + secondMax);
    }
}
