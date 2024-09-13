package topics.strings;

/*
    Run Length Encoding

    Write a function to perform basic string compression using the counts of repeated characters, also known as Run Length Encoding. Let see one example, the input string "aaaabcccccaaa" would become "a4b1c5a3". If the "compressed" string would not become smaller than the original string, your function should return the input string. You can assume the string has only uppercase and lowercase letters. You may use the to_string(int) method to convert an integer into string.

    Sample Inputs

        bbbaaaadexxxxxx
        abc

    Sample Outputs

        b3a4d1e1x6
        abc
 */
public class RunLengthEncoding {

    public static void main(String[] args) {

        String s1 = "bbbaaaadexxxxxx";
        String s2 = "abc";

        System.out.println(compressString(s1));
        System.out.println(compressString(s2));

    }

    //str is the input the string
    static String compressString( String str){
        //length of string
        int n = str.length();

        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i<n;){
            char curr = str.charAt(i);
            int cnt = 0;
            while ( i<n && curr==str.charAt(i)){
                cnt++;
                i++;
            };

            result.append(curr);
            if(cnt>1) result.append(cnt);
        }

        return result.toString();

    }
}
