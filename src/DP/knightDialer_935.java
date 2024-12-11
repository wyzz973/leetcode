package DP;

import java.util.Arrays;

/**
 * @author sd
 * @date 2024/12/10 18:04
 * @description: 2024.12.10每日一题 动态规划
 */
public class knightDialer_935 {
    public int knightDialer(int n) {
        int[][] moves = {
                {4,6},  //0
                {6,8},  //1
                {7,9},  //2
                {4,8},  //3
                {0,3,9}, //4
                {},     //5
                {0,1,7},  //6
                {2,6},  //7
                {1,3},  //8
                {2,4}  //9
        };
        // dp[i] 表示长度为 1 时，数字 i 的跳跃方式数
        int[] dp = new int[10];
        Arrays.fill(dp, 1);

        for (int step = 2; step <= n; step++) {
            int[] nextDp = new int[10];
            // 遍历当前的 dp 数组，更新下一层的 dp
            for (int i = 0; i < nextDp.length; i++) {
                for (int move : moves[i]){
                    nextDp[move] = (nextDp[move] + dp[i]) % 1000000007;
                }
            }
            // 将 nextDp 更新到 dp，准备进行下一步的计算
            dp = nextDp;
        }

        int ans = 0;
        for (int j : dp) {
            ans = (ans + j) % 1000000007;
        }

        return ans % (1000000007);
    }

    public static void main(String[] args) {
        knightDialer_935 solution = new knightDialer_935();
        int N = 3131;  // 例子：序列长度为 3
        System.out.println(solution.knightDialer(N));  // 输出骑士跳跃的不同方式数
    }
}
