package topics.strings;

/*
problem link:- https://leetcode.com/problems/substring-with-concatenation-of-all-words/
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubstringwithConcatenationofAllWords {

    public static void main(String[] args) {
        String s = "foobarfoobar";
        String[] words = {"bar","foo"};

        List<Integer> result = findSubstring(s,words);

        System.out.println(result);
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        List<String> permuted = permutedConcatenation(words);

        for (String p : permuted){
            int index = s.indexOf(p);
            if(index>=0){
                result.add(index);
            }
        }


        return result;
    }


    // Method to generate all permuted concatenated strings
    public static List<String> permutedConcatenation(String[] arr) {
        List<String> result = new ArrayList<>();
        boolean[] used = new boolean[arr.length];
        StringBuilder current = new StringBuilder();
        backtrack(arr, used, current, result);
        return result;
    }

    // Backtracking method to generate permutations and concatenate them
    private static void backtrack(String[] arr, boolean[] used, StringBuilder current, List<String> result) {
        if (current.length() == getTotalLength(arr)) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.append(arr[i]);
                backtrack(arr, used, current, result);
                current.setLength(current.length() - arr[i].length());
                used[i] = false;
            }
        }
    }

    // Helper method to get the total length of all strings in the array
    private static int getTotalLength(String[] arr) {
        int total = 0;
        for (String s : arr) {
            total += s.length();
        }
        return total;
    }

}
