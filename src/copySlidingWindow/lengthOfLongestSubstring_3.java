package copySlidingWindow;

import java.util.Arrays;

public class lengthOfLongestSubstring_3 {
//    public int lengthOfLongestSubstring(String s) {
//        int start = 0;
//        int ans = 0;
//        int[] charCount = new int[256]; // 记录字符的出现次数，假设是 ASCII 字符
//        for (int end = 0; end < s.length(); end++) {
//            char currentChar = s.charAt(end);
//            while (charCount[currentChar] > 0){
//                charCount[s.charAt(start)]--;
//                start++;
//            }
//            charCount[currentChar]++;
//
//            ans = Math.max(ans, end - start + 1);
//        }
//        return ans;
//    }

    public int lengthOfLongestSubstring(String s) {
        int[] next = new int[256];  // 记录字符的最后一次出现的位置
        Arrays.fill(next, -1);  // 初始化为 -1，表示字符没有出现过
        int start = 0;  // 滑动窗口的起始位置
        int ans = 0;  // 最长子串的长度

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // 如果字符已经出现过，更新 start 为上一次出现的位置 + 1
            if (next[currentChar] >= start) {
                start = next[currentChar] + 1;
            }

            // 更新当前字符的出现位置
            next[currentChar] = end;

            // 更新最大子串长度
            ans = Math.max(ans, end - start + 1);
        }
//        for (int i = 0; i < next.length; i++) {
//            System.out.print(next[i] + " ");
//        }
//        System.out.println();
        return ans;
    }


    public static void main(String[] args) {
        lengthOfLongestSubstring_3 solution = new lengthOfLongestSubstring_3();

        System.out.println(solution.lengthOfLongestSubstring("abcabcbb")); // 输出: 3
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));    // 输出: 1
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));   // 输出: 3
        System.out.println(solution.lengthOfLongestSubstring(""));         // 输出: 0
        System.out.println(solution.lengthOfLongestSubstring("au"));       // 输出: 2
    }

}
