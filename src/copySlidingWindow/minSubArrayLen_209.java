package copySlidingWindow;

public class minSubArrayLen_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int sum = 0;
        int sublength = 0;
        int res = nums.length + 1;
        for (int j = 0; j < nums.length; j++){
            sum = sum + nums[j];
            while (sum >= target){    //滑动窗口
                sublength = j - i + 1;
                if (res >= sublength){
                    res = sublength;
                }
                sum = sum - nums[i];
                i++;
            }
        }
        return res == nums.length + 1 ? 0 : res;
    }

    public static void main(String[] args) {
        minSubArrayLen_209 minSubArrayLen_209 = new minSubArrayLen_209();
        System.out.println(minSubArrayLen_209.minSubArrayLen(15, new int[]{1,2,3,4,5}));
    }
}
