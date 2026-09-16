package Sep10.HomeTask;
import java.util.*;

public class Hometask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num = sc.nextInt();
        int[] arr = new int[size];
        int firstOcc = -1;
        int lastOcc = -1;
        boolean isFound = true;
        for(int i=0; i<size; i++)
            {
                arr[i] = sc.nextInt();
                if((arr[i] == num) && isFound)
                    {
                        firstOcc = i;
                        isFound = false;
                        
                    }
                    if(arr[i] == num)
                        {
                            lastOcc = i;
                        }
                    }
                    System.out.println(firstOcc + " " + lastOcc);
                    
                    // for(int i=0; i<size; i++)
                    // {
                    //     arr[i] = sc.nextInt();
                    // }
                    // for(int i=0,j=size-1; i<size; i++,j--)
                    // {
                    //    if(arr[i] == num ) lastOcc = i;
                    //    if(arr[j] == num ) firstOcc = j;
                    //    if(firstOcc != -1 && lastOcc != -1)
                    //    {
                    //         break;            
                    //    }
                    // }
    }
    public static void singleloop()
    {
        
    }
}
// Time Complxcity :
// 2 nomral loops -> O(n)
// Total O(n)

// Space Complexcity :
// new arr -> O(n)
// Totally O(n)