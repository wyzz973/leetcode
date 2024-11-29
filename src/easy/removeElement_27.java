package easy;

public class removeElement_27 {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length - 1;
        while (i < j){

            if (nums[i] != val){
                i++;
            }
            if (nums[j] == val) {
                j++;
            }
            if (nums[i] == val && nums[j] != val){
                int num  = nums[i];
                nums[i]  = nums[j];
                nums[j] = num;
                i++;
                j++;
            }
        }
        return nums.length;
    }
}
