//Average of all element in array

import java.util.*;

class c1{
    public static void main(String args[]){
    
    int a[] = {4, 3, 1, 3, 2};
    float sum = 0;
    float average = 0;
    
    for(int i=0; i<a.length; i++){
        sum = sum + a[i];
        }
    average = sum/2;
    System.out.println(average);
    }
}
