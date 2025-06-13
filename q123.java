class q123 {
    public static void main(String[] args) {
      String a = "aaaa";
      String b = "abbbb";
      String result = "";
      for(int i=0;i<b.length();i++){
          char val = b.charAt(i);
          if(a.indexOf(val)==-1){
              result +=val;
          }
      }
      for(int i=0;i<a.length();i++){
          char val = a.charAt(i);
          if(b.indexOf(val)==-1){
              result +=val;
          }
      }
      System.out.println(result);
    }
}