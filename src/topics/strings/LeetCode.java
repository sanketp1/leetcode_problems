package topics.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LeetCode {

    private static class CustomSort implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(Integer.bitCount(o1), Integer.bitCount(o2));
        }
    }

    public static void main(String[] args) {
            List<Integer> nums = Arrays.asList(1,2,4,5,7,112,3,12,30);

            nums.sort(new CustomSort());

        System.out.println(nums);

    }

}
