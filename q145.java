import java.util.Arrays;

class q145 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2, 3, 4};
        
        
        int max = 0;
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        
        int freq[] = new int[max + 1];
        int len = 0;

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        
      
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] >= 1) {
                len++;
            }
        }
        
        int val[] = new int[len];
        int j = 0;
        
 
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] >= 1) {
                val[j++] = i;
            }
        }
        
        System.out.println(Arrays.toString(val));
    }
}
