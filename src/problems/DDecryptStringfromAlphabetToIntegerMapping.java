package problems;

/*
 problem link:- https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/description/
 */
public class DDecryptStringfromAlphabetToIntegerMapping {

    public static void main(String[] args) {
        String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {

        StringBuilder result = new StringBuilder();
        //length of string
        int n = s.length();

        //traversing string from right to left
        for(int i = n-1; i>=0; i--){
            int number = 0;

            if(s.charAt(i) == '#'){
                number = (s.charAt(i-2)-'0')*10 + (s.charAt(i-1)-'0');
                i = i-2;
            }else{
                number = s.charAt(i)-'0';
            }

            result.append((char) ('a'+(number-1)));

        }

//        StringBuilder result = new StringBuilder();
//
//        int i =0;
//        StringBuilder helper = new StringBuilder();
//
//        while(i<s.length()){
//
//            char curr = s.charAt(i);
//
//            if(curr == '#'){
//                //removing last two letter;
//                result.delete(result.length()-2,result.length());
//                char c = (char) ('a' + Integer.parseInt(helper.substring(helper.length()-2))-1);
//                result.append(c);
//            }else{
//                int d = curr-'0';
//                char l = (char) ('a'+ (d-1));
//                result.append(l);
//                helper.append(d);
//
//            }
//
//            i++;
//
//        }
//
//
        return result.reverse().toString();
    }

}
