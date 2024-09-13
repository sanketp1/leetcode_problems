package topics.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.
Constraints:

    1 <= k <= nums.length <= 10^4

    -10^4 <= nums[i] <= 10^4

Example:

    Input: nums = [3,2,3,1,2,4,5,5,6], k = 4

    Output: 4

 */
public class KthLargestElement {

    public static void main(String[] args) {
      int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(nums,k));
    }

    public static int findKthLargest(int[] nums, int k) {


        //length of the array
        int n = nums.length;

        //we have implementation of quick select
        //we just need to partially sort element
        //especially in reverse order
        //as problem statement said that we have to find the kth largest element
        //considerting 0-based index that's why passing k-1 instead of k
        int result = QuickSelect.quickSelect(nums,0,n-1,k-1,true);

        return result;
    }

}


