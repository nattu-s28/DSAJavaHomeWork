import java.util.Scanner;

public class MaxConsicutiveOnes3 {

    public static int longestOnes(int[] nums, int k) {

        int MaxOnes = 0;
        int zcount = 0;

        for (int left = 0, right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zcount++;
            }

            while (zcount > k) {

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

        int k = sc.nextInt();

        System.out.println(longestOnes(nums, k));

        sc.close();
    }
}

/*
# Max Consecutive Ones III

## Problem Description

Given a binary array nums and an integer k, return the
maximum number of consecutive 1s in the array if you can
flip at most k zeros.

## Examples

### Example 1

Input:
11
1 1 1 0 0 0 1 1 1 1 0
2

Output:
6

Explanation:
The longest subarray contains at most 2 zeros.

### Example 2

Input:
6
1 1 1 1 1 1
2

Output:
6

## Algorithm: Sliding Window

1. Use two pointers, left and right.
2. Expand the window using right.
3. Count the number of zeros.
4. If the zero count exceeds k, move left forward.
5. Track the maximum window length.

## Complexity Analysis

Time Complexity: O(N)
Space Complexity: O(1)

## Statistics

Difficulty: Medium
Topic: Arrays / Sliding Window / Two Pointers
*/