// Leetcode 442. Find All Duplicates in an Array

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Question2 {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(set.contains(num)){
                list.add(num);
            }
            set.add(num);
        }
        return list;
    }
}

