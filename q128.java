public class q128 {
    public static void main(String[] args) {
        int a =3521;
        int b =2452;
        int c =1352;
        int min=9;
        while(c!=0){
            int rem = c%10;
            min = Math.min(min,rem);


            c/=10;
        }
        int sum=0;
      int hund = (b/100)%10;
      int thous = a/1000;
      sum = (thous*hund)+min;
        System.out.println("The key is "+ sum);
     }
}
