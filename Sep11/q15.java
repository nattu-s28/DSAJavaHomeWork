import java.util.HashMap;
import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        String[] idx = sc.nextLine().split(" ");
        
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0;i<idx.length;i++){
            map.put(Integer.parseInt(idx[i]),arr[i]);
        }
        for(int i=0;i<map.size();i++){
            arr[i] = map.get(i);
            System.out.print(arr[i] + " ");
        }
    }
}


// # Reorder Array According to Given Indices

// Given two integer arrays of the same length, `arr[]` and `index[]`, the task is to reorder the elements in `arr[]` such that after reordering, each element from `arr[i]` moves to the position `index[i]`. The new arrangement reflects the values being placed at their target indices, as described by the `index[]` array.

// ## Examples

// ### Example 1
// - **Input:** 
//   - `arr[] = [10, 11, 12]`
//   - `index[] = [1, 0, 2]`
// - **Output:** `11 10 12`
// - **Explanation:** `10` moves to position 1, `11` to 0, and `12` stays at 2.

// ### Example 2
// - **Input:** 
//   - `arr[] = [1, 2, 3, 4]`
//   - `index[] = [3, 2, 0, 1]`
// - **Output:** `3 4 2 1`
// - **Explanation:** `1` moves to 3, `2` to 2, `3` to 0, `4` to 1.

// ### Example 3
// - **Input:** 
//   - `arr[] = [50, 40, 70, 60, 90]`
//   - `index[] = [3, 0, 4, 1, 2]`
// - **Output:** `40 60 90 50 70`

// ---

// ## Solutions

// ### Method 1: Using an Auxiliary Array
// - Create a temporary array of the same size.
// - Loop through the input and place each element at its target index: `temp[index[i]] = arr[i]`.
// - Copy the temporary array back to the original array.
// - **Time Complexity:** $O(n)$
// - **Space Complexity:** $O(n)$

// ### Method 2: In-Place Swapping (Optimal)
// - Loop through the array from the first element to the last.
// - Check if the current element is at its correct target index (`index[i] == i`).
// - If not, swap `arr[i]` with `arr[index[i]]` and swap `index[i]` with `index[index[i]]`.
// - Repeat this swap until the current index holds the correct final value.
// - **Time Complexity:** $O(n)$
// - **Space Complexity:** $O(1)$

