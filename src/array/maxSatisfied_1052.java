package array;

public class maxSatisfied_1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int baseSatisfied = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0){
                baseSatisfied += customers[i];
            }
        }
        int extraSatisfied = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1){
                extraSatisfied += customers[i];
            }
        }
        int maxExtraSatisfied = extraSatisfied;
        for (int i = minutes; i < customers.length; i++) {
            if (grumpy[i - minutes] == 1){
                extraSatisfied -= customers[i - minutes];
            }
            if (grumpy[i] == 1){
                extraSatisfied += customers[i];
            }

            maxExtraSatisfied = Math.max(extraSatisfied,maxExtraSatisfied);
        }

        return baseSatisfied + maxExtraSatisfied;
    }

    public static void main(String[] args) {
        maxSatisfied_1052 solution = new maxSatisfied_1052();

        int[] customers1 = {1, 0, 1, 2, 1, 1, 7, 5};
        int[] grumpy1 = {0, 1, 0, 1, 0, 1, 0, 1};
        System.out.println(solution.maxSatisfied(customers1, grumpy1, 3)); // 输出: 16

        int[] customers2 = {4, 10, 10};
        int[] grumpy2 = {1, 1, 0};
        System.out.println(solution.maxSatisfied(customers2, grumpy2, 2)); // 输出: 24

        int[] customers3 = {10, 1, 7, 3, 8};
        int[] grumpy3 = {0, 0, 1, 0, 1};
        System.out.println(solution.maxSatisfied(customers3, grumpy3, 2)); // 输出: 25
    }
}
