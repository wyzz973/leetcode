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
        Deque<Integer> deque = new LinkedList<>();
        /*
        int j = 0;
        int max = -10001;

        for (int i = 0; i < nums.length; i++) {
            if (deque.size() < k){
                deque.add(nums[i]);
                max = Math.max(max,nums[i]);
                ans[j] = max;
            }else {
                j++;
                max = -10001;
                deque.pop();
                i-=k;
            }
        }

         */
        for (int i = 0; i < nums.length; i++) {

            // 移除队列中已超出窗口范围的元素
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1){
                deque.pollFirst();
            }
            // 保持队列的单调性，移除比当前元素小的所有元素
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.pollLast();
            }
            deque.offerLast(i);

            if (i >= k - 1){
                ans[i - k + 1] = nums[deque.peekFirst()];
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
