package string;

import java.util.Arrays;

public class reverseStr_541 {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i += 2 * k) {
            int left = i;
            int right = Math.min(c.length - 1,left + k - 1);
            while (left < right){
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
            
        }
        return new String(c);
    }
}
