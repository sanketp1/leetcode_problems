//package topics.strings;
//
//import java.util.Arrays;
//
//public class StringNormalisation {
//
//    public static void main(String[] args) {
//
//        String s = "This is SO MUCH FUN!";
//
//        System.out.println(normalize(s));
//
//    }
//
//    static String normalize(String s){
//
//        //converting strings to array
//        char[] str = s.toCharArray();
//        int i = 0;
//        char prev = ' ';
//        while(i<s.length()){
//            if(prev == ' '){
//                if(str[i]>'Z'){
//                    str[i]-='A';
//                }
//                prev = str[i];
//            }else{
//                if(str[i]<='Z'){
//                    str[i]+='A';
//                }
//                prev = str[i];
//            }
//
//            i++;
//
//        }
//
//
//    }
//}
