class asc{
    public static void main(String[] args){
        int num = 4567;
        String arr = String.valueOf(num);
        int prev=0;
        boolean flag = true;
        for(int i=0;i<arr.length();i++){
            int curr= arr.charAt(i)-'0';
            if(i==0){
            prev=arr.charAt(i)-'0';
            }else{
                if(prev>curr){
                    flag = false;
                    break;
                }else{
                    prev= curr;
                }
            }

        }
        System.out.println(flag);
    }
}