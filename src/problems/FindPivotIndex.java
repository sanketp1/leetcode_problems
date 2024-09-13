package problems;

/*
 problem link:- https://leetcode.com/problems/find-pivot-index/description/
 */

public class FindPivotIndex {

    public static void main(String[] args) {
        int[] arr = {2,1,-1};
        System.out.println(pivotIndex(arr));
    }

    public static int pivotIndex(int[] nums) {
        //length of array
        int n = nums.length;

        //making prefix sum
        for(int i = 1; i<n; i++){
            nums[i] = nums[i-1]+nums[i];
        }
        int leftSum = 0;
        int totalSum = nums[n-1];

        for(int i = 0; i<n; i++){
            if(leftSum == (totalSum-nums[i])) return i;
            leftSum = nums[i];
        }

        return  -1;

    }

    public static int equilibriumPoint(long arr[]) {
        // Your code here
        //length of array
        int n = arr.length;

        //making prefix sum
        for(int i = 1; i<n; i++){
            arr[i] = arr[i-1]+arr[i];
        }
        long leftSum = 0;
        long totalSum = arr[n-1];

        for(int i = 0; i<n; i++){
            if(leftSum == (totalSum-arr[i])) return i;
            leftSum = arr[i];
        }

        return  -1;
    }

}
