import java.util.*;

public class LongestSubstringRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {

        int Maxlen = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            char rightch = s.charAt(right);

            map.put(rightch, map.getOrDefault(rightch, 0) + 1);

            while (map.get(s.charAt(right)) > 1) {

                char leftch = s.charAt(left);

                map.put(leftch, map.get(leftch) - 1);

                left++;
            }

            Maxlen = Math.max(Maxlen, right - left + 1);
        }

        return Maxlen;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(lengthOfLongestSubstring(s));

        sc.close();
    }
}
