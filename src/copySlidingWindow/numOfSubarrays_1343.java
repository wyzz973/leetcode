package copySlidingWindow;

public class numOfSubarrays_1343 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        if (sum >= threshold * k){
            ans++;
        }
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            if (sum >= threshold * k){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        numOfSubarrays_1343 solution = new numOfSubarrays_1343();

        int[] arr1 = {2, 1, 3, 4, 1};
        System.out.println(solution.numOfSubarrays(arr1, 3, 3)); // 输出: 0

        int[] arr2 = {1, 1, 1, 1, 1};
        System.out.println(solution.numOfSubarrays(arr2, 2, 1)); // 输出: 4

        int[] arr3 = {4, 4, 4, 4};
        System.out.println(solution.numOfSubarrays(arr3, 2, 4)); // 输出: 3

        int[] arr4 = {11, 13, 17, 23, 29, 31, 7, 5, 2, 3};
        System.out.println(solution.numOfSubarrays(arr4, 3, 5)); // 输出: 6

        int[] arr5 = {5, 5, 5, 5, 5};
        System.out.println(solution.numOfSubarrays(arr5, 1, 5)); // 输出: 5
    }

}
