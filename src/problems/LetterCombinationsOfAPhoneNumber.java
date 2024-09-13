package problems;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args) {
        String digits = "23";
        List<String> result = letterCombinations(digits);

        System.out.println(result);

    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result; // Return an empty list if there are no digits.
        }

        Map<Character, String> mapper = new HashMap<>();
        mapper.put('2', "abc");
        mapper.put('3', "def");
        mapper.put('4', "ghi");
        mapper.put('5', "jkl");
        mapper.put('6', "mno");
        mapper.put('7', "pqrs");
        mapper.put('8', "tuv");
        mapper.put('9', "wxyz");

        // Start the recursive function to build the combinations
        generateCombinations(digits, 0, new StringBuilder(), result, mapper);
        return result;
    }

    private static void generateCombinations(String digits, int index, StringBuilder current, List<String> result, Map<Character, String> mapper) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = mapper.get(digit);
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            generateCombinations(digits, index + 1, current, result, mapper);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }
}
