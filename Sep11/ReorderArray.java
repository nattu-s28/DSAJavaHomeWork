import java.util.*;

public class ReorderArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");
        String[] idx = sc.nextLine().split(" ");

        String[] result = new String[arr.length];

        for (int i = 0; i < idx.length; i++) {
            int index = Integer.parseInt(idx[i]);
            result[index] = arr[i];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}

/*
# Reorder Array According to Given Indices

## Question

Given two arrays of the same length, arr[] and index[],
reorder the elements in arr[] such that each element arr[i]
moves to the position index[i].

The new arrangement reflects the values being placed at
their target indices.

## Examples

### Example 1

Input:
arr[] = [10, 11, 12]
index[] = [1, 0, 2]

Output:
11 10 12

Explanation:
10 moves to position 1.
11 moves to position 0.
12 stays at position 2.

### Example 2

Input:
arr[] = [1, 2, 3, 4]
index[] = [3, 2, 0, 1]

Output:
3 4 2 1

Explanation:
1 moves to position 3.
2 moves to position 2.
3 moves to position 0.
4 moves to position 1.

### Example 3

Input:
arr[] = [50, 40, 70, 60, 90]
index[] = [3, 0, 4, 1, 2]

Output:
40 60 90 50 70

## Solutions

### Method 1: Using an Auxiliary Array

1. Create a temporary array of the same size.
2. Loop through the input array.
3. Place each element at its target index:
   result[index[i]] = arr[i].
4. Print the reordered array.

Time Complexity: O(n)
Space Complexity: O(n)

### Method 2: In-Place Swapping (Optimal)

1. Traverse the array from the first element to the last.
2. Check whether the current element is at its correct index.
3. If not, swap arr[i] with arr[index[i]].
4. Swap the corresponding index values.
5. Repeat until every element reaches its correct position.

Time Complexity: O(n)
Space Complexity: O(1)
*/