package stackQueue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sd
 * @date 2025/2/20 21:43
 * @description: 239.滑动窗口最大值
 */
public class maxSlidingWindow_239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1){
            return nums;
        }
        if (k == nums.length){
            return Arrays.stream(nums).max().stream().toArray();
        }

        int[] ans = new int[nums.length - k + 1];
        int j = 0;
        int max = -10001;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (deque.size() < k){
                deque.add(nums[i]);
                max = Math.max(max,nums[i]);
                ans[j] = max;
            }else {
                j++;
                max = -10001;
                deque.clear();
                i-=k;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{7,2,4};
        int k = 2;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}
