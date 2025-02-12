package hashmap;

import java.util.HashSet;
import java.util.Set;

public class intersection_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        /*
        int[] arr1 = new int[1002];
        int[] arr2 = new int[1002];
        for (int i = 0; i < 1002; i++) {
            arr1[i] = -1;
            arr2[i] = -1;
        }

        for (int j : nums1) {
            arr1[j] = j;
        }
        for (int j : nums2) {
            arr2[j] = j;
        }
        int size = 0;
        for (int i = 0; i < 1002; i++) {
            if (arr1[i] != -1 && arr2[i] != -1 && arr1[i] == arr2[i]){
                size++;
            }
        }
        int[] ans = new int[size];
        int count = 0;
        for (int i = 0; i < 1002; i++) {
            if (arr1[i] != -1 && arr2[i] != -1 && arr1[i] == arr2[i]){
                ans[count] = arr1[i];
                count++;
            }
        }
        return ans;

         */
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2){
            if (set.contains(i)){
                res.add(i);
            }
        }
        return res.stream()           // 将 resSet 转换为流
                .mapToInt(x -> x)  // 每个元素直接映射为 int 类型（不做任何变化）
                .toArray();        // 将流中的所有元素收集到一个 int 数组中
    }
}
