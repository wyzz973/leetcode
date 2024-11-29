package array;

public class removeElement_27 {
//    给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
//
//    假设 nums 中不等于 val 的元素数量为 k，要通过此题，您需要执行以下操作：
//
//    更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。nums 的其余元素和 nums 的大小并不重要。
//    返回 k。
    public int removeElement(int[] nums, int val) {
        //快慢指针
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        removeElement_27 solution = new removeElement_27();

        int[] nums1 = {3, 2, 2, 3};
        System.out.println(solution.removeElement(nums1, 3)); // 输出: 2, 数组前两个元素为 [2, 2]

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(solution.removeElement(nums2, 2)); // 输出: 5, 数组前五个元素为 [0, 1, 3, 0, 4]

        int[] nums3 = {2, 2, 2};
        System.out.println(solution.removeElement(nums3, 2)); // 输出: 0, 数组为空

        int[] nums4 = {1, 2, 3, 4, 5};
        System.out.println(solution.removeElement(nums4, 6)); // 输出: 5, 数组保持不变
    }

}
