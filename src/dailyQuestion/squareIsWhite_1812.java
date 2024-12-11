package dailyQuestion;

/**
 * @author sd
 * @date 2024/12/9 19:26
 * @description: 2024.12.9每日一题
 */
public class squareIsWhite_1812 {
    public boolean squareIsWhite(String coordinates) {
        if (coordinates.charAt(0) % 2 == 1) {
            return coordinates.charAt(1) % 2 == 0;
        }else {
            return coordinates.charAt(1) % 2 == 1;
        }
    }

    public static void main(String[] args) {
            squareIsWhite_1812 obj = new squareIsWhite_1812();
            System.out.println(obj.squareIsWhite("a1")); // false (黑色)
            System.out.println(obj.squareIsWhite("h3")); // true (白色)
            System.out.println(obj.squareIsWhite("c7")); // false (黑色)
        }

}
