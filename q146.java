class q146{
    public static void main(String []args){
        int arr[] = {45, 25,1, 0,69, 40 };
        int lg=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lg){
                ans=lg;
                lg=arr[i];
               
            }else if(arr[i]>ans&&arr[i]<lg){
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}