 
import java.util.*;
class Main {
    public static void main(String[] args) {
       
       int arr [] = {10,20,10,30,14,40,60,10};
       int target = 10;
       int count=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==target){
               count++;
           }
       }
       int j=0;

       int newarr[] = new int [arr.length+count];
              count=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==target){
               count++;
               newarr[j++]=arr[i];
               newarr[j++]=count;
           }else{
               newarr[j++]=arr[i];
           }
       }
       System.out.println(Arrays.toString(newarr));
    }
}