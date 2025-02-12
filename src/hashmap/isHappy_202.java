package hashmap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class isHappy_202 {

    public int sum(int k){
        int sum = 0;
        while (k != 0){
            sum += (int) Math.pow((k % 10),2);
            k /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        /*
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int k = n;
        while (sum != 1){
            sum = 0;
            while (k != 0){
                sum += (int) Math.pow((k % 10),2);
                k /= 10;
            }
            k = sum;
            if (!set.add(sum)){
                return false;
            }
        }
        return true;

         */
        //快慢指针

        int slow = n;
        int fast = sum(n);

        while (fast != 1 && slow != fast){
            slow = sum(slow);
            fast = sum(sum(fast));
        }
        return slow == 1;

    }
    public static void main(String[] args) {
        isHappy_202 solution = new isHappy_202();

        // 测试用例 1：输入 19 是快乐数
        int testCase1 = 19;
        boolean result1 = solution.isHappy(testCase1);
        System.out.println("Test case 1 - Is 19 a happy number? " + result1);  // 应该输出 true

        // 测试用例 2：输入 2 不是快乐数
        int testCase2 = 2;
        boolean result2 = solution.isHappy(testCase2);
        System.out.println("Test case 2 - Is 2 a happy number? " + result2);  // 应该输出 false

        // 测试用例 3：输入 1 是快乐数
        int testCase3 = 1;
        boolean result3 = solution.isHappy(testCase3);
        System.out.println("Test case 3 - Is 1 a happy number? " + result3);  // 应该输出 true

        // 测试用例 4：输入 7 是快乐数
        int testCase4 = 7;
        boolean result4 = solution.isHappy(testCase4);
        System.out.println("Test case 4 - Is 7 a happy number? " + result4);  // 应该输出 true
    }
}
