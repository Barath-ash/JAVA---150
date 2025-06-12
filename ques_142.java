import java.util.Arrays;

public class ques_142 {
    public static void main(String[] args) {
        int arr[]= {10,5,20,30,1,4,25};

         System.out.println(Arrays.toString(ranked(arr)));

    }


    static int[] ranked(int arr[]){
           int[] result = new int[arr.length];


        

          for(int i=0;i<arr.length;i++){
            int rank=1;
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    rank++;
                } 
            } 
            result[i]= rank;  
          }
 return result;
        }
}
