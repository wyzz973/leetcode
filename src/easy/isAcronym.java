package easy;

import java.util.List;

public class isAcronym {

    public void isAcronym1(List<String> words, String s) {
        String s1 = "";
        for (String word:
                words) {
            s1 += String.valueOf(word.charAt(0));
        }
        System.out.println(s1);
    }


}
