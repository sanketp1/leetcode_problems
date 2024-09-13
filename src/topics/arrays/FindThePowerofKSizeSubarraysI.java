package topics.arrays;

/*
    problem link:- https://leetcode.com/problems/find-the-power-of-k-size-subarrays-i/description/
 */

import java.util.Arrays;

public class FindThePowerofKSizeSubarraysI {

    public static void main(String[] args) {
            int[] nums = {1,2,3,4,3,2,5};
            int k = 3;

            var result = resultsArray(nums,k);
           System.out.println(Arrays.toString(result));
    }

    public static int[] resultsArray(int[] nums, int k) {
            //length of array
        int n = nums.length, cnt = 1;
        if(k == 1) return nums;
        int[] res = new int[n-k+1];
        Arrays.fill(res, -1);

        for(int i=1; i<n; i++)
        {
            if(nums[i] != nums[i-1]+1)
                cnt = 1;
            else
            {
                cnt++;
                if(cnt >= k)
                    res[i-k+1] = nums[i];
            }
        }
        return res;


    }

}
