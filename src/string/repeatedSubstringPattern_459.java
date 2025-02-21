package string;

public class repeatedSubstringPattern_459 {
    public void getNext(int[] next,String str){
        int j = 0;
        next[0] = 0;
        for (int i = 1; i < next.length; i++) {
            while (j > 0 && str.charAt(i) != str.charAt(j)){
                j = next[j - 1];
            }
            if (str.charAt(i) == str.charAt(j)){
                j++;
            }
            next[i] = j;
        }
    }
    public boolean repeatedSubstringPattern(String s) {
        if (s.isEmpty()){
            return false;
        }
        int[] next = new int[s.length()];
        getNext(next,s);

        if (next[next.length - 1] > 0 && next.length % (next.length - next[next.length - 1]) == 0){
            return true;
        }
        return false;


    }
}
