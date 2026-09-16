package Sep10.HomeTask;
import java.util.*;

public class Hometask2 {
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int cutoff = sc.nextInt();
        int eligibleStudents = 0;

        for(int i=0; i<size; i++)
        {
            eligibleStudents += (sc.nextInt() >= cutoff) ? 1 : 0;
        }
        System.out.println(eligibleStudents);
    }
}

// Time Complexcity :
// 1 loop - O(n)
// Total - O(n)

// Space Complexity :
// All are Constant space variables
// Total - O(1)
