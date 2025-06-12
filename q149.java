class q149{
    public static void main(String []args){
        int arr[] = {2, 4, 1, 3};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]*arr[i];
        }
        System.out.println(sum);
    }
}