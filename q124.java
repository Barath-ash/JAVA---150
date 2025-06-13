class q124 {
    public static void main(String[] args) {
        String str = "000012356090";
        String result = "";
        
        if(str.charAt(0)==0&&str.charAt(1)!=0){
             result+=str.charAt(0);
        }
        for(int i=1;i<str.length();i++){
             
           
              String temp = str.substring(i-1,i+1);

            
            if(temp.equals("00")){
                continue;
            }else{
                result +=str.charAt(i);
                 
            }
        }
        System.out.println(result);
    }
}