package problems;

public class CountAndSay {

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
//        System.out.println(helper("11"));
    }

    public static String helper(String val){

        StringBuilder result = new StringBuilder();

        int i = 0;
        int j = 0;

        while(j<val.length()){
            while( j<val.length() && val.charAt(i) == val.charAt(j)){
                j++;
            }
            result.append(j-i);
            result.append(val.charAt(i));
            i = j;
        }

        return result.toString();
    }

    public static String countAndSay(int n) {
        String base = "1";

        for(int i = 1; i<n; i++){
            base = helper(base);
        }

        return base;
    }

}
