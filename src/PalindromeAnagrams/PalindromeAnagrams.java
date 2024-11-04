package PalindromeAnagrams;

import java.util.HashMap;
import java.util.Map;

public class PalindromeAnagrams {
    public static boolean hasPalindromeAnagrams(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }

        int oddCount = 0;
        for (int count : map.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }

    public static void main(String[] args) {
        String s = "carrace";
        System.out.println(hasPalindromeAnagrams(s));
    }
}
