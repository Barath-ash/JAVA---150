public class q137_TwinPrimeDiff1 {
    public static void main(String[] args) {
        int limit = 100; // can be any number

        for (int i = 2; i < limit; i++) {
            if (isPrime(i) && isPrime(i + 1)) {
                System.out.println(i + " and " + (i + 1));
            }
        }
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
