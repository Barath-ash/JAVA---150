 
    public  class qno51 {
        public static void main(String[] args) {
           
            System.out.println("No-5");
            
         
            for (int i = 5; i >= 1; i--) {
                if (i == 4) {
                    
                    for (int j = 1; j <= i; j++) {
                        char a = (char)('A' + j - 1);
                        System.out.print(a);
                        if (j < i)  
                            System.out.print(" ");
                    }
                } else if (i == 3) {
                    
                    for (int j = i; j >= 1; j--) {
                        char a = (char)('A' + j);
                        System.out.print(a);
                        if (j > 1)
                            System.out.print(" ");
                    }
                } else {
                   
                    for (int j = i; j >= 1; j--) {
                        char a = (char)('A' + j - 1);
                        System.out.print(a);
                        if (j >=1)
                            System.out.print(" ");
                    }
                }
                System.out.println();  
            }
        }
    }

