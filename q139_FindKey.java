public class q139_FindKey {
    public static void main(String[] args) {
        int[] inputs = {3521, 2452, 1352};

        int minThousand = 9, minHundred = 9, minTen = 9, minUnit = 9;

        for (int num : inputs) {
            int thousand = num / 1000;
            int hundred = (num / 100) % 10;
            int ten = (num / 10) % 10;
            int unit = num % 10;

            minThousand = Math.min(minThousand, thousand);
            minHundred = Math.min(minHundred, hundred);
            minTen = Math.min(minTen, ten);
            minUnit = Math.min(minUnit, unit);
        }

        int key = minThousand * 1000 + minHundred * 100 + minTen * 10 + minUnit;
        System.out.println("Key = " + key);  
    }
}
