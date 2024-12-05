package copySlidingWindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findRepeatedDnaSequences_187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        if (s.length() < 10) {
            return ans;
        }

//        String DnaSequences = s.substring(0,10);
//
//        for (int i = 10; i < s.length(); i++) {
//            if (s.substring(i - 10,i).equals(DnaSequences)) {
//                ans.add(DnaSequences);
//            }else {
//                DnaSequences = s.substring(i - 10,i);
//            }
//
//        }

        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String subsequence = s.substring(i, i + 10);
            if (!seen.add(subsequence)){
                repeated.add(subsequence);
            }
        }
        ans.addAll(repeated);
        return ans;
    }

    public static void main(String[] args) {
        findRepeatedDnaSequences_187 solution = new findRepeatedDnaSequences_187();
        System.out.println(solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        System.out.println(solution.findRepeatedDnaSequences("AAAAAAAAAAAAA"));
        System.out.println(solution.findRepeatedDnaSequences("A"));
        System.out.println(solution.findRepeatedDnaSequences("AAAAAAAAAAA"));

    }

}
