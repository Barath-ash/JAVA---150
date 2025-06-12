lass neigh{
    int num=129345;
    String str =String.valueOf(num);
    boolean flag = true;
    for(int i=1;i<str.length()-1;i++){
        int val1=str.charAt(i-1)-'0';
        int val2=str.charAt(i+1)-'0';
        int curr=str.charAt(i)-'0';
      if(curr-val1!=1&&curr-val2!=-1){
        flag = false;
        break;
      }
    }
    System.out.println(flag);
}
