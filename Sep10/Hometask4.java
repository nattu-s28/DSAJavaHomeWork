package Sep10.HomeTask;
import java.util.*;

public class Hometask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length() == 1)
        {
            System.out.println(s);
            return;
        }
        // usingstringBulider(s);
        normalreverse(s);

    }
    public static void usingstringBulider(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
    }

// Time Complexcity :
// builder assign + reverse() takes -> O(2n)
// Total O(n)

// Space Complexcity :
// Builder takes O(n) Space
// reverse also O(n) Space
// Totally O(n)

    public static void normalreverse(String s)
    {
        String reversedString = "";
        for(int i=s.length()-1; i>=0; i--)
        {
            reversedString = reversedString + s.charAt(i);
        }
        System.out.println(reversedString);
    }

// Time Complexcity :
// loop -> O(n)
// Total O(n)

// Space Complexcity :
// No Extra space O(1)
// Total O(1)
}
