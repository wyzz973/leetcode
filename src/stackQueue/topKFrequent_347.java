package stackQueue;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author sd
 * @date 2025/2/21 18:11
 * @description: 347.前K个高频元素
 */
public class topKFrequent_347 {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        /*
        List<Map.Entry<Integer,Integer>> sortedList = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()).reversed();
        int i = 0;
        for (Map.Entry<Integer,Integer> entry : sortedList){
            if (i >= k){
                break;
            }
            ans[i] = entry.getKey();
            i++;
        }

         */
        //基于大顶堆实现

        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
        for (var entry : map.entrySet()){
            pq.add(new int[]{entry.getKey(),entry.getValue()});
        }

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll()[0];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,2,2,3,3,3,3,4,4,4,4,4,5};
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }
}
