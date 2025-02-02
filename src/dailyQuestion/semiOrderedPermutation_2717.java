package dailyQuestion;

public class semiOrderedPermutation_2717 {
    public int semiOrderedPermutation(int[] nums) {
        if (nums[0] == 1 && nums[nums.length-1] == nums.length){
            return 0;
        }
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                a = i;
            }
            if (nums[i] == nums.length){
                b = i;
            }
        }
        if (a < b){
            return a + (nums.length - b - 1);
        }else {
            return a + (nums.length - b - 1) - 1;
        }
    }

    public static void main(String[] args) {
        semiOrderedPermutation_2717 obj = new semiOrderedPermutation_2717();
        System.out.println(obj.semiOrderedPermutation(new int[]{1, 3, 2, 4})); // 0
        System.out.println(obj.semiOrderedPermutation(new int[]{4, 3, 2, 1})); // 5
        System.out.println(obj.semiOrderedPermutation(new int[]{1, 2, 3, 4})); // 0
        System.out.println(obj.semiOrderedPermutation(new int[]{2, 1, 4, 3})); // 3
    }

}
