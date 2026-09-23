import java.util.Scanner;

public class RunningSum {

    public static int[] runningSum(int[] nums) {

        int sum = 0;

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = runningSum(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}

/*
# Running Sum of 1d Array

## Problem Description

Given an array nums, return the running sum of nums.

The running sum is calculated as:
runningSum[i] = sum(nums[0] ... nums[i])

## Example

Input:
5
1 2 3 4 5

Output:
1 3 6 10 15

## Algorithm

1. Start from index 1.
2. Add the previous element to the current element.
3. Continue until the end of the array.
4. Return the modified array.

## Complexity Analysis

Time Complexity: O(N)
Space Complexity: O(1)

## Topic

Arrays / Prefix Sum
*/