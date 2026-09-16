import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Leetcode 1207. Unique Number of Occurrences

public class Question4 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int num : map.keySet()){
            if(list.contains(map.get(num))){
                return false;
            }
            list.add(map.get(num));
        }
        return true;
    }
}
