class q146 {
    public static void main(String[] args) {
        String str = "khoor";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            result += (char)(val - 3);  
        }

        System.out.println(result);  
    }
}