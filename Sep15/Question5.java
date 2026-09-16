import java.util.ArrayList;
import java.util.List;

// Leetcode - 2956. Find Common Elements Between Two Arrays

public class Question5 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        List<Integer> numsList1 = new ArrayList<>();
        List<Integer> numsList2 = new ArrayList<>();
        for(int i=0; i < nums1.length;i++){
                numsList1.add(nums1[i]);
        }
        for(int j=0; j < nums2.length;j++){
                numsList2.add(nums2[j]);
        }
        int cnt1 = 0;
        for(int num : numsList1){
            if(numsList2.contains(num)){
                cnt1++;
            }
        }
        int cnt2 = 0;
        for(int num : numsList2){
            if(numsList1.contains(num)){
                cnt2++;
            }
        }
        return new int[]{cnt1,cnt2};
    }
}
