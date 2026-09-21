import java.util.*;

public class MaximumSumofDistinctSubarraysWithLengthK {
    
    public static long maximumSubarraySum(int[] nums, int k) {

        long longsum = 0;
        long sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (i >= k) {

                sum -= nums[i - k];

                if (map.get(nums[i - k]) > 1) {
                    map.put(nums[i - k], map.get(nums[i - k]) - 1);
                } else {
                    map.remove(nums[i - k]);
                }
            }

            if (i >= k - 1 && map.size() == k) {
                longsum = Math.max(longsum, sum);
            }
        }

        return longsum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(maximumSubarraySum(nums, k));

        sc.close();
    }
}
