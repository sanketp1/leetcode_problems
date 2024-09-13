package problems;

/*
problem link:- https://leetcode.com/problems/long-pressed-name/description/
 */
import java.util.*;

public class IsLongPressedName {
    public static void main(String[] args) {
        String name = "pyplrz";
        String typed = "ppyypllr";

        System.out.println(isLongPressedName(name, typed));
    }
    public static boolean isLongPressedName(String name, String typed) {
        Queue<Character> q = new LinkedList<>();

        for(char c : typed.toCharArray()){
            q.add(c);
        }
        if(!(q.size() >= name.length())) return false;

        int i = 0;
        char prev = name.charAt(0);
        while (i<name.length() && q.size()>0) {
            char rem = q.remove();
            if (name.charAt(i) == rem) {
                prev = name.charAt(i);
                i++;
            }else{
                if(prev != rem){
                    return false;
                }
            }
        }

        while(q.size()>0){
            if(name.charAt(name.length()-1) != q.remove()) return false;
        };

        return i== name.length() && q.isEmpty();
    }
}
