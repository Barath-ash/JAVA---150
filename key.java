class key{
    public static void main(String []args){
        int a= 3521;
        int b= 2452;
        int c= 1352;
        int sum =0;
        int a_sm=Integer.MAX_VALUE;
        int a_lg=Integer.MIN_VALUE;
         while(a!=0){
            int rem = a%10;
            a_lg=Math.max(a_lg,rem);
            a_sm=Math.min(a_sm,rem);
            a/=10;
        }
        sum+=a_lg+a_sm;

 

        int b_sm=Integer.MAX_VALUE;
        int b_lg=Integer.MIN_VALUE;
         while(b!=0){
            int rem = b%10;
            b_lg=Math.max(b_lg,rem);
            b_sm=Math.min(b_sm,rem);
            b/=10;
        }
        sum+=b_lg+b_sm;
 

        int c_sm=Integer.MAX_VALUE;
        int c_lg=Integer.MIN_VALUE;
         while(c!=0){
            int rem = c%10;
            c_lg=Math.max(c_lg,rem);
            c_sm=Math.min(c_sm,rem);
            c/=10;
        }
        sum+=c_lg+c_sm;
         
 System.out.println(sum);
 

    }
}