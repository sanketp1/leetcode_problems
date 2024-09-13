package topics.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class BiggestNumberString {

    static  class IntegerLexicographicComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer i1, Integer i2) {
            String n1 = Integer.toString(i1);
            String n2 = Integer.toString(i2);
            return  (n1+n2).compareTo(n2+n1);
        }
    }
    public static void main(String[] args) {
        Integer[] arr = {3,30,34,5,9};
        String result = concatenate(arr);

        System.out.println(result);
    }

    static String concatenate(Integer[] numbers){
        //length of array
        int n = numbers.length;

        Arrays.sort(numbers,new IntegerLexicographicComparator());

        StringBuilder result = new StringBuilder();

        for (int i = n-1; i >=0 ; i--) {
            result.append(numbers[i]);
        }

        return  result.toString();
    }

}
