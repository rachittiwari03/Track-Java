//Calculate the sum of element in array
import java.util.*;

class c1{
    public static void main(String args[]){
    
    int a[] = {10,5,10,15,10,5};
    int sum = 0;
    
    for(int i=0; i<a.length; i++){
        sum = sum + a[i];
    }
    System.out.println("sum " + sum);
    }
}    