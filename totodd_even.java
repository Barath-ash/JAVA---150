class totodd_even{
    public static void main(String[] args){
        int n = 53467;
        int odd=0;
        int even=0;
        while(n!=0){
            int rem=n%10;
            if(rem%2==0){
                even++;
            }else{
                odd++;
            }
            n/=10;
        }
        System.out.println("Odd: "+odd);
        System.out.println("Even: "+even);
    }
}