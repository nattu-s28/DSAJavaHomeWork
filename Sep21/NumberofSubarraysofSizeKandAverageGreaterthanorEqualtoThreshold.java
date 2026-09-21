import java.util.*;

public class NumberofSubarraysofSizeKandAverageGreaterthanorEqualtoThreshold {    

    public static int numOfSubarrays(int[] arr, int k, int threshold) {

        int count = 0;
        int sum = 0;

        for (int i = 0, j = 0; j < arr.length; j++) {

            sum += arr[j];

            if (j >= k - 1) {

                int mean = sum / k;

                if (mean >= threshold) {
                    count++;
                }

                sum -= arr[i++];
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int threshold = sc.nextInt();

        System.out.println(numOfSubarrays(arr, k, threshold));

        sc.close();
    }
}
