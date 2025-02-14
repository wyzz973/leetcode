package string;

public class strStr_28 {

    public void getNext(int[] next,String str){
        int j = 0;
        next[0] = 0;
        for (int i = 1; i < str.length(); i++) {
            while (j > 0 && str.charAt(i) != str.charAt(j)){
                j = next[j - 1];
            }
            if (str.charAt(i) == str.charAt(j)){
                j++;
            }
            next[i] = j;
        }
    }

    public int strStr(String haystack, String needle) {
        int j = 0;
        int[] next = new int[needle.length()];
        getNext(next,needle);
        for (int i = 0; i < haystack.length(); i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)){
                j = next[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(i)){
                j++;
            }
            if (j == needle.length()){
                return haystack.length() - i + 1;
            }
        }
        return -1;
    }
}

