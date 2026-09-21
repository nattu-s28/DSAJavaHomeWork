import java.util.*;
public class AverageofPrefixes {

    public static int[] prefixAvg(int[] arr) {

        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            count++;
            sum += arr[i];

            int Avg = sum / count;

            arr[i] = Avg;
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = prefixAvg(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
