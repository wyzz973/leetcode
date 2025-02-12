package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class canConstruct_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        /*
        if (magazine.length() < ransomNote.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for (char c : ransomNote.toCharArray()){
            map.put(c,map.getOrDefault(c,0) - 1);
            if (map.get(c) <= 0){
                return false;
            }
        }
        return true;

         */

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            arr1[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            arr2[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < arr2[i]){
                return false;
            }
        }
        return true;
    }
}
