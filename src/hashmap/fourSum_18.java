package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target && nums[i] >= 0) {
                break;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] > target && nums[j] + nums[i] >= 0) {
                    break;
                }
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;
                int twoSum = nums[i] + nums[j];
                while (left < right) {
                    if (nums[left] + nums[right] + twoSum > target) {
                        right--;
                    } else if (nums[left] + nums[right] + twoSum < target) {
                        left++;
                    } else {
                        list.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));


                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;
                    }

                }

            }

        }

        return list;
    }
}
