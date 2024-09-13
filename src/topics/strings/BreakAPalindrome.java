package topics.strings;

public class BreakAPalindrome {

    public static void main(String[] args) {
        String palindrome = "aba";
        System.out.println(breakPalindrome(palindrome));
    }

    static public String breakPalindrome(String palindrome) {
        //length of string
        int n = palindrome.length();
        if(n<=1) return "";

        char[] strs = palindrome.toCharArray();

        for(int i = 0; i<n; i++){
            int j = n-i-1;

            if(i==j) continue;

            if(strs[i]!='a') {
                strs[i] = 'a';
                return new String(strs);
            }

        }
        strs[n-1] = 'b';
        return new String(strs);
    }

}
