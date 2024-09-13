package topics.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CustomSortString {

    public static void main(String[] args) {

        String order = "bcafg";
        String s = "abcd";

        System.out.println(customSortString(order,s));

        String o1  = "kqep";
        String s1 = "pekeq";

        System.out.println(customSortString(o1,s1));

        String o2 = "hucw";
        String s2 = "utzoampdgkalexslxoqfkdjoczajxtuhqyxvlfatmptqdsochtdzgypsfkgqwbgqbcamdqnqztaqhqanirikahtmalzqjjxtqfnh";
        System.out.println(customSortString(o2,s2));
    }

    public static String customSortString(String order, String s) {

        if(s.isEmpty() || order.isEmpty()) return "";

            char[] s2Arr = s.toCharArray();
            Arrays.sort(s2Arr);

        Map<Character,Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s2Arr.length; i++) {
            map.put(s2Arr[i], map.getOrDefault(s2Arr[i],0)+1);
        }

        for (char o : order.toCharArray()) {
             if(map.containsKey(o)){
                 result.append(String.valueOf(o).repeat(map.get(o)));
                 map.remove(o);
             }
        }

        for (Map.Entry<Character,Integer> e :map.entrySet()){
            result.append(String.valueOf(e.getKey()).repeat(e.getValue()));
        }



//        StringBuilder result = new StringBuilder();
//        char[] arr = s.toCharArray();
//
//        for (int i = 0; i< arr.length; i++) {
//            char c = arr[i];
//            map.put(c, map.getOrDefault(c,0)+1);
//        }
//
//        for (char c : order.toCharArray()){
//            if(map.containsKey(c)){
//                result.append(String.valueOf(c).repeat(map.get(c)));
//            }
//        }
//
//        for (char x : arr){
//            if (!(result.indexOf(String.valueOf(x))>=0)){
//                result.append(x);
//            }
//        }




        //
//        char[] result = s.toCharArray();
//
//        for(int i = 0; i<order.length(); i++){
//
//            char currOrder = order.charAt(i);
//            int index = 0;
//
//            while(index< result.length && result[index]!=currOrder) index++;
//
//            if(index< result.length){
//                char temp = result[i];
//                result[i] = result[index];
//                result[index] = temp;
//            }
//
//
//        }
//
//
//
//
//        return new String(result);

        return  result.toString();
    }
}
