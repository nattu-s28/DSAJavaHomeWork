import java.util.Scanner;

public class RotatearrayRight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int d = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        rotateArr(arr, d);

        sc.close();
    }

    public static void rotateArr(int arr[], int d) {
        int n = arr.length;

        d = d % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] reverse(int[] arr, int left, int right) {
        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }
}

/*
# Rotate Array Right

## Problem Description

Given an array arr[] of size N, rotate the array to the
right by d positions.

## Rules and Constraints

1. The rotation must shift elements to the right.
2. Elements removed from the right end wrap around to the left.
3. If d is greater than N, use d % N.
4. The operation should be performed in-place.

## Examples

### Example 1

Input:
5 2
1 2 3 4 5

Output:
4 5 1 2 3

Explanation:
Rotate 1 position right:
5 1 2 3 4

Rotate 2 positions right:
4 5 1 2 3

### Example 2

Input:
4 5
10 20 30 40

Output:
40 10 20 30

Explanation:
N = 4
Effective rotations = 5 % 4 = 1

## Optimal Algorithm: Reversal Strategy

1. Update d using d = d % N.
2. Reverse the entire array.
3. Reverse the first d elements.
4. Reverse the remaining elements.

## Complexity Analysis

Time Complexity: O(N)
Space Complexity: O(1)

## Statistics

Difficulty: Easy
Topic: Arrays / Two Pointers
*/