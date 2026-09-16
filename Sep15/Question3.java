// Leetcode 1748. Sum of Unique Elements

import java.util.HashMap;

public class Question3 {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : map.keySet()){
            if(map.get(num) == 1){
                sum += num;
            }
        }
        return sum;
    }
}
