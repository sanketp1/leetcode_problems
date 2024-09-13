package topics.arrays;

/*
    https://leetcode.com/problems/trapping-rain-water/
 */


public class TrappingRainWater {


    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }

    public static int trap(int[] height) {
        //length of array
        int n = height.length;
        int result = 0;

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = height[0];
        right[n-1] = height[n-1];

        for(int i = 1; i<n;i++){
            left[i] = Math.max(height[i], left[i-1]);
            right[n-i-1] = Math.max(height[n-i-1],right[n-i]);
        }

        for(int i = 0; i<n; i++){
            result+=Math.min(left[i],right[i])-height[i];
        }

        return result;
    }

}
