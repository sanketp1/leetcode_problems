package topics.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SubSequencesOfString {

    static class LengthLexicographicComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            if(o1.length()==o2.length()) return o1.compareTo(o2);

            return Integer.compare(o1.length(),o2.length());
        }
    }



    public static void main(String[] args) {

        String s = "abcd";
        List<String> result = new ArrayList<>();

        //getting all the subsequences of string
        generateSubSequeces(s,"",result);

        result.sort(new LengthLexicographicComparator());

        //printing all the subsequences
        System.out.println(result);

    }

    public static void generateSubSequeces(String s, String ouptut, List<String> list){
        if(s.isEmpty()){
            list.add(ouptut);
            return;
        }

        char curr = s.charAt(0);

        String reducedInput = s.substring(1);

        //includes the character
        generateSubSequeces(reducedInput,ouptut+curr,list);

        //excludes the character
        generateSubSequeces(reducedInput,ouptut,list);
    }
}
