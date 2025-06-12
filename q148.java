class q148{
    public static void main(String []args){
        int arr[] = {20, -10, 15, 00, -85 };
        int pos=0;
        int neg=0;
        for(int i=0;i<arr.length;i++){
             if(arr[i]>0){
                pos++;
             }else if(arr[i]<0){
                neg++;
             }
        }
        System.out.println(pos);
        System.out.println(neg);
    }
}