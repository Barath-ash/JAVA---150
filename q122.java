class q122 {
    public static void main(String[] args) {
       String str = "WelcomeJava";
       String add = "to";
       int index = 4;
       String st =str.substring(0,str.length()-index);
       String end = str.substring(str.length()-index);
       System.out.println(st+add+end);
    }
}