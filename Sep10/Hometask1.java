package Sep10.HomeTask;
import java.util.*;

class Hometask1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);

        }
        int j = 0;
        double sd = 0;
        double Avg = (double)sum/size;

        // Step - 1 :
        System.out.println("Scores:");
        for(int i=0;i<size; i++)
        {
            System.out.print(arr[i] + " ");
            j++;
            if(j == 4){
                System.out.println();
                j = 0;
            }
            // for sd : 
            sd += Math.pow((arr[i] - Avg),2);
        }
        double sd1 = Math.sqrt((sd / size));
        double std = Math.ceil(Math.sqrt(((sd / (size-1)))));
        // Step - 2 :
        System.out.printf("%nAverage: %.2f%n%n", Avg);
        
        // Step - 3 :
        System.out.println("Lowest Score: " + min);
        System.out.println();

        // Step - 4 :
        System.out.println("Highest Score: " + max);
        System.out.println();
        
        // Step - 5 :
        System.out.println("Score Deviation");
        int ScoreWithOneSd = 0;
        for(int i=0;i<size; i++)
        {
            System.out.printf("%d  %.2f%n", arr[i],arr[i] - Avg);
            if(((Avg) - std) <= arr[i] && arr[i] <= ((Avg) + std))
            {
                ScoreWithOneSd++;
            }
        }
        System.out.println();

        // Step - 6 :
        System.out.printf("Standard Deviation: %.2f%n%n",sd1);

        // Step - 7 :
        System.out.println("Scores with one Standard Deviation: " + ScoreWithOneSd);
    }
}

// Time Complexcity :
// all computations are in O(1)
// 3 Normal loops - O(3n) -> O(n)
// Total - O(n)

// Space Complexity :
// new arr[] - O(n)
// others are Constant space variables
// Total - O(n)