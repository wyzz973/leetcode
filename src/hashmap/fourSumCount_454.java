package hashmap;

import java.util.HashMap;
import java.util.Map;

public class fourSumCount_454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums1){
            for (int j : nums2){
                int sum = i + j;
                map.put(sum, map.getOrDefault(sum,0) + 1);
            }
        }

        for (int i : nums3){
            for (int j : nums4){
                int temp = -(i + j);
                count += map.getOrDefault(temp,0);
            }
        }

        return count;
    }
}
