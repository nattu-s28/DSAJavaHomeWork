import java.util.Scanner;

public class RotatearrayRight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        rotateArr(arr,d);
    }
    public static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr,0,n-1);
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static int[] reverse(int[] arr,int left,int right){
        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right]; 
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}

// # Rotate Array Right

// ## 📌 Problem Description
// Given an array `arr[]` of size `N`, your task is to rotate the array to the right by `d` positions. 

// ### ⚠️ Rules and Constraints
// * The rotation must shift elements to the right. Elements that fall off the right end must wrap around to the left end.
// * The number of rotations `d` can be greater than the size of the array `N`. In such cases, effective rotations will be `d % N`.
// * The operation should ideally be done in-place to optimize space usage.

// ---

// ## 💡 Examples

// ### Example 1
// * **Input:** `arr[] = [1, 2, 3, 4, 5]`, `d = 2`
// * **Output:** `[4, 5, 1, 2, 3]`
// * **Explanation:** 
//   * Rotate 1 position right: `[5, 1, 2, 3, 4]`
//   * Rotate 2 positions right: `[4, 5, 1, 2, 3]`

// ### Example 2
// * **Input:** `arr[] = [10, 20, 30, 40]`, `d = 5`
// * **Output:** `[40, 10, 20, 30]`
// * **Explanation:** 
//   * Array size `N = 4`. Effective rotations: `5 % 4 = 1`.
//   * Rotating 1 position right gives: `[40, 10, 20, 30]`

// ---

// ## 🛠️ Optimal Algorithm (Reversal Strategy)

// To rotate the array right in-place with **O(1) extra space**, the reversal algorithm works as follows:
// 1. Handle cases where `d > N` by updating `d = d % N`.
// 2. **Reverse the entire array** from index `0` to `N-1`.
// 3. **Reverse the first `d` elements** from index `0` to `d-1`.
// 4. **Reverse the remaining elements** from index `d` to `N-1`.

// ---

// ## 📊 Complexity Analysis

// * **Time Complexity:** **O(N)** — Each element is traversed a constant number of times during the reversal steps.
// * **Space Complexity:** **O(1)** — The rotation is performed in-place without using extra arrays or lists.

// ---

// ## 🏆 Statistics
// * **Difficulty:** Easy
// * **Topic:** Arrays / Pointers
