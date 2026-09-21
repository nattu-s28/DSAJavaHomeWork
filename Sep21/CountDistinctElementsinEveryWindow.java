import java.util.*;

public class CountDistinctElementsinEveryWindow {
    
    public static ArrayList<Integer> countDistinct(int[] arr, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0, j = 0; j < arr.length; j++) {

            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

            if (j >= k - 1) {

                list.add(map.size());

                map.put(arr[i], map.get(arr[i]) - 1);

                if (map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }

                i++;
            }
        }

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        ArrayList<Integer> result = countDistinct(arr, k);

        System.out.println(result);

        sc.close();
    }
}