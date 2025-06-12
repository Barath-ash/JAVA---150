public class q143 {
 public static void main(String[] args) {
    int arr[]= {12,1313,122,678,898};
    int stab=0;
    int notsta=0;

    for(int num : arr){
        if(stable(num)){
            stab++;
        }
        else{
            notsta++;
        }

        System.out.println((notsta*10)+stab);
    }
 }   



 static boolean stable(int n){
    int [] val = new int[10];
    
    while(n!=0){
        int rem = n%10;
        val[rem]++;
        n/=10;
    }

    int curr=0;
    
    for(int i=0;i<val.length;i++){
        if(val[i]>=1){
            if(curr==0){
                curr= val[i];
              }
              else if(curr!=val[i]){
                return false;
              }
        }
    
    }

return true;

 }
}
