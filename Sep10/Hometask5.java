package Sep10.HomeTask;
import java.util.*;

public class Hometask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        for(int i=0;i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size; i++)
        {
            for(int j=i+1;j<size;j++)
            {
                System.out.println("(" + arr[i]+ "," + arr[j] +")");
            }
        }
    }
}

// Time Complexcity :
// normal loop + nested loop - > O(n) + O(n2) = O(n2)
// Total -> O(n2)

// Space Complexity :
// new arr -> O(n)
// Total -> O(n)