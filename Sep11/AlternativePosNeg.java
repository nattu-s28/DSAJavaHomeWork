import java.util.ArrayList;
import java.util.Scanner;

class AlternativePosNeg {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total elements:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        rearrange(arr);

        System.out.println(arr);
        sc.close();
    }

    public static void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int x : arr) {
            if (x >= 0) pos.add(x);
            else neg.add(x);
        }

        arr.clear();
        int i = 0, j = 0;

        while (i < pos.size() && j < neg.size()) {
            arr.add(pos.get(i++));
            arr.add(neg.get(j++));
        }

        while (i < pos.size()) arr.add(pos.get(i++));
        while (j < neg.size()) arr.add(neg.get(j++));
    }
}

// # Alternate Positive and Negative Numbers

// ## 📌 Problem Description
// Given an unsorted array `arr[]` containing both positive and negative numbers, rearrange the array and convert it into an array of alternating positive and negative numbers **without changing their relative order**.

// ### ⚠️ Rules and Constraints
// * The resulting array must always **start with a positive integer**.
// * `0` (Zero) is considered a **positive integer** for this problem.
// * If either the positive or negative integers are exhausted before the other, append all remaining integers to the end of the array while maintaining their original relative order.

// ---

// ## 💡 Examples

// ### Example 1
// * **Input:** `arr[] = [9, 4, -2, -1, 5, 0, -5, -3, 2]`
// * **Output:** `[9, -2, 4, -1, 5, -5, 0, -3, 2]`
// * **Explanation:** 
//   * Positive numbers are `[9, 4, 5, 0, 2]`
//   * Negative numbers are `[-2, -1, -5, -3]`
//   * Alternating them starting with positive gives: `9`, `-2`, `4`, `-1`, `5`, `-5`, `0`, `-3`, `2`.

// ### Example 2
// * **Input:** `arr[] = [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]`
// * **Output:** `[5, -5, 2, -2, 4, -8, 7, 1, 8, 0]`
// * **Explanation:** 
//   * Positive numbers are `[5, 2, 4, 7, 1, 8, 0]`
//   * Negative numbers are `[-5, -2, -8]`
//   * Negative numbers run out after `-8`. The remaining positive numbers `[7, 1, 8, 0]` are appended to the back as they are.

// ### Example 3
// * **Input:** `arr[] = [9, 5, -2, -1, 5, 0, -5, -3, 2]`
// * **Output:** `[9, -2, 5, -1, 5, -5, 0, -3, 2]`
// * **Explanation:** 
//   * Positive numbers are `[9, 5, 5, 0, 2]`
//   * Negative numbers are `[-2, -1, -5, -3]`
//   * Alternating them starting with positive gives: `9`, `-2`, `5`, `-1`, `5`, `-5`, `0`, `-3`, `2`.

// ---

// ## 📊 Complexity Analysis

// * **Time Complexity:** **O(N)** — We iterate through the array of size $N$ to separate elements, and iterate again to merge them back. 
// * **Space Complexity:** **O(N)** — Extra space is utilized to store the elements in two separate dynamic arrays.
