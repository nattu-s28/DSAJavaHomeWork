import java.util.*;

public class MaxConsicutiveOnes1 {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int cnt = 0;
        int maxlen = 0;

        for (int i = 0; i < nums.length; i++) {

            cnt++;

            if (nums[i] != 1) {
                cnt = 0;
            }

            maxlen = Math.max(maxlen, cnt);
        }

        return maxlen;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(findMaxConsecutiveOnes(nums));

        sc.close();
    }
}

