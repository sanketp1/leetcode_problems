package topics.arrays;

/*
problem link:- https://leetcode.com/problems/shortest-unsorted-continuous-subarray/description/
 */

public class ShortestUnsortedContinuousSubarray {

    public static void main(String[] args) {
        int[] nums = {2,6,4,8,10,9,15};
        int result = findUnsortedSubarray(nums);

        System.out.println(result);
    }

    public static int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;

        // Find the initial boundaries
        while (l < n - 1 && nums[l] <= nums[l + 1]) {
            l++;
        }
        while (r > 0 && nums[r] >= nums[r - 1]) {
            r--;
        }

        // If the entire array is already sorted
        if (l >= r) return 0;

        // Find the maximum and minimum in the unsorted subarray
        int subarrayMax = Integer.MIN_VALUE;
        int subarrayMin = Integer.MAX_VALUE;

        for (int i = l; i <= r; i++) {
            subarrayMax = Math.max(subarrayMax, nums[i]);
            subarrayMin = Math.min(subarrayMin, nums[i]);
        }

        // Expand the left boundary if needed
        while (l > 0 && nums[l - 1] > subarrayMin) {
            l--;
        }

        // Expand the right boundary if needed
        while (r < n - 1 && nums[r + 1] < subarrayMax) {
            r++;
        }

        return r - l + 1;
    }
}
