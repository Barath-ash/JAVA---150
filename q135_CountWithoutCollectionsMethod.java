import java.util.Scanner;

public class q135_CountWithoutCollectionsMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();   
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        countOccurrences(arr, size);  
        sc.close();
    }

    static void countOccurrences(int[] arr, int size) {
        boolean[] visited = new boolean[size];

        for (int i = 0; i < size; i++) {
            if (!visited[i]) {
                int count = 1;

                for (int j = i + 1; j < size; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }

                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }
}
