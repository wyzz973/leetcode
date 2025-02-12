package hashmap;

import java.util.HashMap;
import java.util.Map;

public class twoSum_1 {
    public int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];
        if (nums == null || nums.length < 2){
            return null;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)){
                ans[0] = i;
                ans[1] = map.get(temp);
                break;
            }else {
                map.put(nums[i],i);
            }
        }
        return ans;

        //双指针 todo




    }
}
