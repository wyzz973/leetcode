package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class isAnagram_242 {
    public boolean isAnagram(String s, String t) {
        /**
        if (s.length() != t.length()){
            return false;
        }

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                return false;
            }
        }
        return true;
        **/
        if (s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0) - 1);
            if (map.get(t.charAt(i)) < 0){
                return false;
            }
        }
        return true;

    }
}
