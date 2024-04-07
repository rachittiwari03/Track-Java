//Count frequency of each element in the array
import java.util.*;

class c1{
    public static void main(String args[]){
    
    int a[] = {10,5,10,15,10,5};
    
    int max[] = new int[999999];
    
    for(int i=0; i<max.length; i++)
    max[i] = 0;
    
    for(int i=0; i<a.length; i++)
    max[a[i]]++;
    
    for(int i=0; i<max.length; i++){
        if(max [i] > 0){
            System.out.println(i +" "+max[i]);
        }
    }
    
    }
 }