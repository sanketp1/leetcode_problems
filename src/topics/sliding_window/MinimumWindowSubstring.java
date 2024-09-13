package topics.sliding_window;

/*

 problem link:- https://leetcode.com/problems/minimum-window-substring/description/

 */

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s =  "ADOBECODEBANC";
        String t = "ABC";

        String result = minWindow(s,t);

        System.out.println(result);

    }

    public static String minWindow(String s, String t) {
        // Frequency map of pattern characters
        int[] fp = new int[256]; // frequency of pattern characters
        int[] fs = new int[256]; // frequency of string characters

        // Filling the pattern frequency map
        for (int i = 0; i < t.length(); i++) {
            fp[t.charAt(i)]++;
        }

        // Sliding window algorithm variables
        int cnt = 0; // Count of characters matched
        int start = 0; // Start of the window
        int startIdx = -1; // Start index of the minimum window
        int minSofar = Integer.MAX_VALUE; // Size of the smallest window

        for (int i = 0; i < s.length(); i++) {
            // Current character from the string
            char ch = s.charAt(i);

            // Update the frequency of current character in the window
            fs[ch]++;

            // Count how many characters match till now
            if (fp[ch] != 0 && fs[ch] <= fp[ch]) {
                cnt++;
            }

            // If all characters are matched, try to shrink the window
            if (cnt == t.length()) {
                // Shrink the window from the left
                while (fp[s.charAt(start)] == 0 || fs[s.charAt(start)] > fp[s.charAt(start)]) {
                    fs[s.charAt(start)]--;
                    start++;
                }

                // Update the minimum window size if a smaller window is found
                int windowSize = i - start + 1;
                if (windowSize < minSofar) {
                    minSofar = windowSize;
                    startIdx = start;
                }
            }
        }

        // If no valid window found, return empty string
        if (startIdx == -1) {
            return "";
        }

        // Return the minimum substring that contains all characters of t
        return s.substring(startIdx, startIdx + minSofar);
    }

}
