class qnp50{
    public static void main(String[] args) {
     
        for(int i=1;i<=5;i++){
             for(int j=1;j<i;j++){
                 System.out.print(" ");
            }
            for(int j=5-i+1;j>=1;j--){
                 char a = (char)('A'+j-1);
                 System.out.print(a);
            }
                    
 System.out.println();
        }
       
    }
}