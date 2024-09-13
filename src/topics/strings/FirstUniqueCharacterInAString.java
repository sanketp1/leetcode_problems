package topics.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
First Unique Character in a String

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Constraints:

    1 <= s.length <= 10^5

    s consists of only lowercase English letters.

Example 1:

    Input: s = "codingminutes"

    Output: 0

Example 2:

    Input: s = "aabb"

    Output: -1
 */
public class FirstUniqueCharacterInAString {



    public static void main(String[] args) {
        String s  =  "aabb";

        int result = firstUniqChar(s);
        System.out.println(result);
    }

    static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) return i;
        }

        return -1;
    }
}
