package array;

import java.util.Arrays;

public class getAverages_2090 {
    public int[] getAverages(int[] nums, int k) {
        long sum = 0;
        int[] ans = new int[nums.length];

        // 如果窗口大小超过数组长度，所有值都设置为 -1
        if (k * 2 + 1 > nums.length) {
            for (int i = 0; i < nums.length; i++) {
                ans[i] = -1;
            }
            return ans;
        }

        for (int i = 0; i < k; i++) {
            ans[i] = -1;
        }
        for (int i = ans.length - 1; i >= nums.length - k ; i--) {
            ans[i] = -1;
        }

        for (int i = 0; i < k * 2 + 1; i++) {
            sum = sum + nums[i];
        }

        ans[k] = (int)(sum / (2 * k + 1));
        int j = k + 1;
        for (int i = k * 2 + 1; i < nums.length; i++) {
             sum = sum - nums[i - (2 * k + 1)] + nums[i];
             ans[j] = (int)(sum / (2 * k + 1));
             j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        getAverages_2090 solution = new getAverages_2090();

        int[] nums1 = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        System.out.println(Arrays.toString(solution.getAverages(nums1, 3))); // 输出: [-1, 4, 5, 4, 6, 4, 5, 4, -1]

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution.getAverages(nums2, 2))); // 输出: [-1, -1, 3, -1, -1]

        int[] nums3 = {1};
        System.out.println(Arrays.toString(solution.getAverages(nums3, 0))); // 输出: [1]

        int[] nums4 = {1};
        System.out.println(Arrays.toString(solution.getAverages(nums4, 1))); // 输出: [-1]

        int[] nums5 = {1, 1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(solution.getAverages(nums5, 3))); // 输出: [-1, -1, -1, 1, -1, -1, -1]
    }

}
