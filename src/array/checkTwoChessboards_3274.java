package array;

public class checkTwoChessboards_3274 {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
//        if((coordinate1.charAt(0) - coordinate2.charAt(0)) % 2 == 0){
//            if ((coordinate1.charAt(1) - coordinate2.charAt(1)) % 2 == 0){
//                return true;
//            }else {
//                return false;
//            }
//        }else {
//            if ((coordinate1.charAt(1) - coordinate2.charAt(1)) % 2 != 0){
//                return true;
//            }else {
//                return false;
//            }
//        }
        // 棋盘格的颜色可以通过 (列字符 + 行数字) 的奇偶性来判断
        return ((coordinate1.charAt(0) + coordinate1.charAt(1)) % 2) ==
                ((coordinate2.charAt(0) + coordinate2.charAt(1)) % 2);
    }

    public static void main(String[] args) {
        checkTwoChessboards_3274 solution = new checkTwoChessboards_3274();

        // 测试用例
        System.out.println(solution.checkTwoChessboards("a1", "c3")); // true (相同颜色)
        System.out.println(solution.checkTwoChessboards("a1", "h8")); // true (相同颜色)
        System.out.println(solution.checkTwoChessboards("a1", "b2")); // true (相同颜色)
        System.out.println(solution.checkTwoChessboards("a1", "a2")); // false (不同颜色)
        System.out.println(solution.checkTwoChessboards("a1", "c2")); // false (不同颜色)
        System.out.println(solution.checkTwoChessboards("d5", "g2")); // true (不同颜色)
        System.out.println(solution.checkTwoChessboards("h1", "g8")); // true (相同颜色)
        System.out.println(solution.checkTwoChessboards("h8", "h8")); // true (相同格子)

        // 边界测试
        System.out.println(solution.checkTwoChessboards("a1", "h8")); // true
        System.out.println(solution.checkTwoChessboards("a8", "h1")); // true
    }
}
