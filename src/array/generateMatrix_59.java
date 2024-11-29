package array;

public class generateMatrix_59 {
//    public int[][] generateMatrix(int n) {
//        int[][] arr = new int[n][n];
//        int count = 0;
//        int x = 0;
//        int y = 0;
//        int offset = 1;
//        int i,j;
//        while(count < (n * n)){
//            for (j = x; j < n - offset; j++) {
//                System.out.println(y);
//                System.out.println(j);
//                arr[y][j] = count + 1;
//                count++;
//                print2DArray(arr);
//            }
//
//            for (i = y; i < n - offset; i++) {
//                arr[i][j] = count + 1;
//                count++;
//                print2DArray(arr);
//            }
//
//            for (; j > x ; j--) {
//                arr[i][j] = count + 1;
//                count++;
//                print2DArray(arr);
//            }
//
//            for (; i > y ; i--) {
//                arr[i][j] = count + 1;
//                count++;
//                print2DArray(arr);
//            }
////            System.out.println(count);
//            x++;
//            y++;
//            offset++;
//
//        }
//        return arr;
//    }
//public int[][] generateMatrix(int n) {
//    int[][] arr = new int[n][n];
//    int count = 0; // 用于填充数组的计数器
//    int x = 0, y = 0; // 起始坐标
//    int offset = 0; // 偏移量，用于控制边界收缩
//    int i, j;
//
//    while (count < n * n) {
//        // 从左到右填充
//        for (j = x; j < n - offset; j++) {
//            arr[y][j] = ++count;
//        }
//
//        // 从上到下填充
//        for (i = y + 1; i < n - offset; i++) {
//            arr[i][n - offset - 1] = ++count;
//        }
//
//        // 从右到左填充（确保不重复）
//        for (j = n - offset - 2; j >= x && count < n * n; j--) {
//            arr[n - offset - 1][j] = ++count;
//        }
//
//        // 从下到上填充（确保不重复）
//        for (i = n - offset - 2; i > y && count < n * n; i--) {
//            arr[i][x] = ++count;
//        }
//
//        // 更新边界
//        x++;
//        y++;
//        offset++;
//    }
//
//    return arr;
//}
public int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];
    int count = 1; // 填充的起始值
    int top = 0, bottom = n - 1, left = 0, right = n - 1;

    while (count <= n * n) {
        // 从左到右填充
        for (int j = left; j <= right; j++) {
            matrix[top][j] = count++;
        }
        top++; // 收缩上边界

        // 从上到下填充
        for (int i = top; i <= bottom; i++) {
            matrix[i][right] = count++;
        }
        right--; // 收缩右边界

        // 从右到左填充
        if (top <= bottom) { // 避免重复填充
            for (int j = right; j >= left; j--) {
                matrix[bottom][j] = count++;
            }
            bottom--; // 收缩下边界
        }

        // 从下到上填充
        if (left <= right) { // 避免重复填充
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = count++;
            }
            left++; // 收缩左边界
        }
    }

    return matrix;
}

    public static void print2DArray(int[][] array) {
        for (int[] row : array) { // 遍历每一行
            for (int element : row) { // 遍历每一行的元素
                System.out.print(element + " "); // 打印元素并用空格分隔
            }
            System.out.println(); // 每打印一行后换行
        }
    }

    public static void main(String[] args) {
        generateMatrix_59 solution = new generateMatrix_59();
        // 打印二维数组
        System.out.println("二维数组内容：");
        print2DArray(solution.generateMatrix(5));
    }
}
