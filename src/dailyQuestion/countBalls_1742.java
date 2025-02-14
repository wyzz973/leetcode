package dailyQuestion;


import java.util.Arrays;

/**
 * Data 2025.02.13
 */
public class countBalls_1742 {
    public int countBalls(int lowLimit, int highLimit) {
        int[] count = new int[54];
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = 0;
            int temp = i;
            while (temp != 0){
                sum += temp % 10;
                temp /= 10;
            }
            count[sum]++;
        }
        for (int i = 1; i < count.length; i++) {
            if (count[i] > count[0]){
                count[0] = count[i];
            }
        }
        return count[0];
    }


    public static void main(String[] args) {
        countBalls_1742 solution = new countBalls_1742();

        // 测试用例 1
        int lowLimit = 1;
        int highLimit = 10;
        System.out.println("Test case 1: " + solution.countBalls(lowLimit, highLimit)); // 2

        // 测试用例 2
        lowLimit = 5;
        highLimit = 15;
        System.out.println("Test case 2: " + solution.countBalls(lowLimit, highLimit)); // 2

        // 测试用例 3
        lowLimit = 20;
        highLimit = 30;
        System.out.println("Test case 3: " + solution.countBalls(lowLimit, highLimit)); // 2
    }
}
