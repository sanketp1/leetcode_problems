package topics.sliding_window;

/*
 problem link:- https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {


    public static void main(String[] args){

        String s = "zxbyad";
        int result = lengthOfLongestSubstring(s);
        String sub = LongestSubstringWithNoRepeatingCharacter(s);
        System.out.println(result);
        System.out.println(sub);
    }

    public static String LongestSubstringWithNoRepeatingCharacter(String str) {
        //length of string
        int n = str.length();

        Set<Character> charSet = new HashSet<>();
        int res = 0;
        int i = 0;
        String result = "";
        for (int j = 0; j < str.length(); j++) {
            while (charSet.contains(str.charAt(j))) {
                charSet.remove(str.charAt(i));
                i++;
            }
            charSet.add(str.charAt(j));
//            res = Math.max(res, j - i + 1);
            int newLen = j-i+1;
            if(newLen>res){
                res = newLen;
                result = str.substring(i,j+1);
            }
        }

        return result;

    }

    public static int lengthOfLongestSubstring(String s) {
        //length of string
        int n = s.length();

        Set<Character> charSet = new HashSet<>();
        int res = 0;
        int i = 0;

        for (int j = 0; j < s.length(); j++) {
            while (charSet.contains(s.charAt(j))) {
                charSet.remove(s.charAt(i));
                i++;
            }
            charSet.add(s.charAt(j));
            res = Math.max(res, j - i + 1);
        }

        return res;

    }



}
