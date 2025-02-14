package string;

public class reverseWords_151 {
    public char[] removeExtraSpaces(char[] s){
        int slow = 0;
        for (int fast = 0; fast < s.length; fast++) {
            if (s[fast] != ' '){

                if (slow != 0){
                    s[slow++] = ' ';
                }

                while (fast < s.length && s[fast] != ' '){
                    s[slow++] = s[fast++];
                }
            }
        }

        char[] res = new char[slow];
        System.arraycopy(s, 0, res, 0, res.length);
        return res;
    }

    public void reverseString(char[] chars, int left, int right){
        while (left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }


    public String reverseWords(String s) {
        char[] c = removeExtraSpaces(s.toCharArray());
        reverseString(c,0,c.length - 1);
        int left = 0;
        int right = 0;
        while (right <= c.length){
            if (right < c.length && c[right] != ' '){
                right++;
                continue;
            }
            reverseString(c,left,right - 1);
            left = right + 1;
            right++;
        }
        return new String(c);
    }

    public static void main(String[] args) {
        String input = "the sky is blue";
        String expectedOutput = "blue is sky the";
        reverseWords_151 reverseWords151 = new reverseWords_151();
        String result =  reverseWords151.reverseWords(input);
        // Output the result and check if it matches the expected output
        System.out.println("Input: " + input);
        System.out.println("Expected Output: " + expectedOutput);
        System.out.println("Actual Output: " + result);

        // Check if the result matches the expected output
        if (result.equals(expectedOutput)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed.");
        }
    }
}
