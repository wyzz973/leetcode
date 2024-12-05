package copySlidingWindow;

public class minimumRecolors_2379 {
    public int minimumRecolors(String blocks, int k) {
        int ans = 0;
        int white = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W'){
                white++;
            }
        }
        ans = white;
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W') {
                white--;
            }
            // 加入窗口的元素
            if (blocks.charAt(i) == 'W') {
                white++;
            }
            ans = Math.min(ans,white);
        }
        return ans;
    }

    public static void main(String[] args) {
        minimumRecolors_2379 solution = new minimumRecolors_2379();

        System.out.println(solution.minimumRecolors("WBBWWBBWBW", 7)); // 输出: 3
        System.out.println(solution.minimumRecolors("WBWBBBW", 2));    // 输出: 0
        System.out.println(solution.minimumRecolors("WWWWWW", 3));     // 输出: 3
        System.out.println(solution.minimumRecolors("BBBBBB", 4));     // 输出: 0
    }
}
