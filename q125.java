 

class q125 {
    public static void main(String[] args) {
         String str = "programming";
         String low="";
         String high="";
         int max =0;
         for(int i=0;i<str.length();i++){
             int count =1;
             for(int j=i+1;j<str.length();j++){
                 if(str.charAt(i)==str.charAt(j)){
                     count++;
                 }
             }
             if(count>max){
                 max = count;
             }
             
         }    
             for(int i=0;i<str.length();i++){
                 char val = str.charAt(i);
                 int count= counter(val,str);
                 if(count>=max&&high.indexOf(val)==-1){
                     high +=str.charAt(i);
                 }else if(low.indexOf(val)==-1&&high.indexOf(val)==-1){
                         low +=str.charAt(i);
                 }
             }
         
         System.out.println(high);
         System.out.println(low);
    }
    
    static int counter(char c,String str){
        int count=0;
        for(int i=0;i<str.length();i++){
             char val = str.charAt(i);
            if(val==c){
                count++;
            }
        }
        return count;
    }
}