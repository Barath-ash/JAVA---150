public class q140 {
     
        public static void main(String []args){
            int a= 3521;
            int b= 2452;
            int c= 1352;
            int sum =0;
            int a_sm=Integer.MAX_VALUE;
            int a_lg=Integer.MIN_VALUE;
             while(a!=0){
                int rem = a%10;
                if(rem>a_lg){
                    a_sm = a_lg;
                    a_lg = rem;
                }
                else if(rem>a_sm&&rem<a_lg){
                    a_sm=rem;
                }
                a/=10;
            }
           
            sum+=a_lg+a_sm;
    
     
    
            int b_sm=Integer.MAX_VALUE;
            int b_lg=Integer.MIN_VALUE;
             while(b!=0){
                int rem = b%10;
                if(rem>b_lg){
                    b_sm = b_lg;
                    b_lg = rem;
                }
                else if(rem>b_sm&&rem<b_lg){
                    b_sm=rem;
                }
                b/=10;
            }
            sum+=b_lg+b_sm;
     
    
            int c_sm=Integer.MAX_VALUE;
            int c_lg=Integer.MIN_VALUE;
             while(c!=0){
                int rem = c%10;
                if(rem>c_lg){
                    c_sm = c_lg;
                    c_lg = rem;
                }
                else if(rem>c_sm&&rem<c_lg){
                    c_sm=rem;
                }
                c/=10;
            }
            sum+=c_lg+c_sm;
             
     System.out.println(sum);
     
    
        }
    }

