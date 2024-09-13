package problems;

/*
problem link:- https://leetcode.com/problems/decrease-elements-to-make-array-zigzag/description/
 */

public class DecreaseElementsToMakeArrayZigzag {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        System.out.println(movesToMakeZigzag(nums1));

        int[] nums2 = {9,6,1,6,2};
        System.out.println(movesToMakeZigzag(nums2));

    }

    public static int movesToMakeZigzag(int[] nums) {
        int moves = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if( (i%2 == 0) && nums[i]>nums[i+1]){
                moves = nums[i]-nums[i+1]+1;
            }
            else{
                if((i%2) == 1){
                    if(nums[i]<nums[i+1]){
                        moves = nums[i+1]-nums[i]+1;
                    }
                }
            }
        }

        return moves;
    }

    private static void swap(int[] arr , int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
