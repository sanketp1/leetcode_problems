package problems;

/*
 Problem Link:- https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 */

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII {

    public static void main(String[] args) {
       int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0)
        {
            return 0;
        }

        int j = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] == nums[i-1])
            {
                count++;
            }
            else
            {
                count = 1;
            }

            if (count <= 2)
            {
                nums[j] = nums[i];
                j++;
            }

        }

        System.out.println(Arrays.toString(nums));

        return j;
//        //length of array
//        int n = nums.length;
//
//        int k = n;
//
//        int i = 0;
//        int j = 0;
//
//        while(i<k){
//
//            while( j<k && nums[i] == nums[j]){
//                j++;
//            }
//
//            if((j-i)>2){
//               int m = i+2;
//               int p = j;
//                while(p<k){
//                    int temp = nums[m];
//                    nums[m] = nums[p];
//                    nums[p] = temp;
//                    p++;
//                    m++;
//                }
//
//                k = k - (j-i-2);
//                i=j=i+2;
//            }
//            else{
//                i = j;
//            }
//
//
//        }
//
//
//        return k;

    }

}
