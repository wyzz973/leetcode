package array;

public class search_704 {
// 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length;

        if (nums[left] > target || nums[right - 1] < target){
            return -1;
        }

        while(left < right){
            int middle = left + ((right - left) >> 1);

            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < target){
                left = middle + 1;
            }else {
                right = middle;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        search_704 search_704 = new search_704();
        System.out.println(search_704.search(new int[]{-1,0,3,5,9,12}, 9));
    }
}
