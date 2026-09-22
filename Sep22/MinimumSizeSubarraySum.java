import java.util.Scanner;

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {

        int minsize = Integer.MAX_VALUE;

        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum >= target) {

                minsize = Math.min(minsize, right - left + 1);

                sum -= nums[left++];
            }
        }

        return (minsize == Integer.MAX_VALUE) ? 0 : minsize;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(minSubArrayLen(target, nums));

        sc.close();
    }
}

/*
# Minimum Size Subarray Sum

## Problem Description

Given an array of positive integers nums and a positive
integer target, return the minimal length of a contiguous
subarray whose sum is greater than or equal to target.

If no such subarray exists, return 0.

## Examples

### Example 1

Input:
7
6
2 3 1 2 4 3

Output:
2

Explanation:
The subarray [4, 3] has a sum of 7 and length 2.

### Example 2

Input:
4
4
1 4 4 2

Output:
1

Explanation:
The subarray [4] has a sum of 4 and length 1.

### Example 3

Input:
11
5
1 1 1 1 1

Output:
0

Explanation:
No subarray has a sum greater than or equal to 11.

## Algorithm: Sliding Window

1. Initialize left, sum, and minimum size.
2. Expand the window using right.
3. Add the current element to sum.
4. While sum is greater than or equal to target:
   - Update the minimum subarray length.
   - Remove the leftmost element.
   - Move left forward.
5. Return the minimum length or 0 if no valid subarray exists.

## Complexity Analysis

Time Complexity: O(N)
Space Complexity: O(1)

## Statistics

Difficulty: Medium
Topic: Arrays / Sliding Window / Two Pointers
*/