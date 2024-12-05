package copySlidingWindow;

public class findMaxAverage_643 {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        int ans = sum;
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            sum -= nums[j];
            sum += nums[i];
            j++;
            ans = Math.max(ans,sum);
        }

        return (double)ans/k;
    }

    public static void main(String[] args) {
        findMaxAverage_643 solution = new findMaxAverage_643();

        int[] nums1 = {1, 12, -5, -6, 50, 3};
        System.out.println(solution.findMaxAverage(nums1, 4)); // 输出: 12.75

        int[] nums2 = {5, 5, 5, 5};
        System.out.println(solution.findMaxAverage(nums2, 2)); // 输出: 5.0

        int[] nums3 = {-1, -2, -3, -4, -5};
        System.out.println(solution.findMaxAverage(nums3, 2)); // 输出: -1.5

        int[] nums4 = {0, 4, 0, 3, 2};
        System.out.println(solution.findMaxAverage(nums4, 3)); // 输出: 3.0
    }

}
