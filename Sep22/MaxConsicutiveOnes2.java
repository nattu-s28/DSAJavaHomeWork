import java.util.*;
public class MaxConsicutiveOnes2 {

    public static int longestOnes(int[] nums) {
        int MaxOnes = 0;
        int zcount = 0;
        for (int left = 0, right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zcount++;
            }
            while (zcount > 1) {
                if (nums[left] == 0) {
                    zcount--;
                }
                left++;
            }
            MaxOnes = Math.max(MaxOnes, right - left + 1);
        }
        return MaxOnes;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(longestOnes(nums));
        sc.close();
    }
}