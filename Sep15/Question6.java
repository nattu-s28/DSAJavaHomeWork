import java.util.HashMap;

// Leetcode - 219. Contains Duplicate II

class Question6 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
            else{
                if((Math.abs(map.get(nums[i]) - i)) <= k) { 
                    return true;
                }
                map.put(nums[i],i);
            }
        }
        return false;
    }
}