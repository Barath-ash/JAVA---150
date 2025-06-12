class q147{
    public static void main(String []args){
        int arr[] = {45, 25,1, 0,69, 40 };
        int sm=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<sm){
                ans=sm;
                sm=arr[i];
               
            }else if(arr[i]<ans&&arr[i]>sm){
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}