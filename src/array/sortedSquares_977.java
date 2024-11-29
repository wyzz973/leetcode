package array;

import java.util.Arrays;

//给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
public class sortedSquares_977 {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int j = nums.length - 1;
        while (left <= right){
            if ((nums[left] * nums[left]) < (nums[right] * nums[right])){
                res[j] = nums[right] * nums[right];
                right--;
            }else {
                res[j] = nums[left] * nums[left];
                left++;
            }
            j--;
        }

        return res;
    }

    public static void main(String[] args) {
        sortedSquares_977 solution = new sortedSquares_977();

        int[] nums1 = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(solution.sortedSquares(nums1))); // 输出: [0, 1, 9, 16, 100]

        int[] nums2 = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(solution.sortedSquares(nums2))); // 输出: [4, 9, 9, 49, 121]

        int[] nums3 = {-1};
        System.out.println(Arrays.toString(solution.sortedSquares(nums3))); // 输出: [1]

        int[] nums4 = {1};
        System.out.println(Arrays.toString(solution.sortedSquares(nums4))); // 输出: [1]
    }

}
