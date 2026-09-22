import java.util.*;

public class MaximumPairSum {

    static ArrayList<Integer> maxSum(int[] arr, int k) {
        Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList<>(2);

        int left = 0;
        int right = arr.length - 1;
        int p1 = -1;
        int p2 = -1;
        int max = 0;

        while (left < right) {
            if ((arr[left] + arr[right]) < k) {
                if (arr[left] + arr[right] > max) {
                    p1 = arr[left];
                    p2 = arr[right];
                    max = arr[left] + arr[right];
                }
                left++;
            } else {
                right--;
            }
        }

        list.add(p1);
        list.add(p2);

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(maxSum(arr, k));

        sc.close();
    }
}