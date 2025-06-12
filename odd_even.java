class odd_even{
    public static void main(String[] args){
       int num= 361589;
       String str = String.valueOf(num);
       String odd="";
       String even="";
       int od=0;
       int ev=0;
       for(int i=0;i<str.length();i++){
        int val = str.charAt(i)-'0';
        if(val%2==0){
            even+=str.charAt(i);
            ev++;
        }
        else{
            odd+=str.charAt(i);
            od++;
        }
       }
       int val = Integer.parseInt(odd+String.valueOf(od)+even+String.valueOf(ev));
       System.out.println(val);

    }
}