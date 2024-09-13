package topics.arrays;

/*

    Implement a function that takes an input a vector of integers, and prints the maximum subarray sum that can be formed. A subarray is defined as consecutive segment of the array. If all numbers are negative, then return 0.

    Input

        {-1,2,3,4,-2,6,-8,3}

    Output

    13


    Hint

    Expected Time Complexity
    O(N)


    Space Complexity
    O(1)

 */

import java.util.Arrays;

public class MaximumSubarraySum {

    public static void main(String[] args) {
        int[] arr = {-1,2,3,4,-2,6,-8,3};
        int result = maxSubarraySum(arr);

        System.out.println(result);
    }

   static int maxSubarraySum(int[] arr){
       // Check if the array is empty
       if (arr == null || arr.length == 0) {
           return 0;
       }

       // Initialize variables to keep track of the maximum subarray sum ending at the current position (maxEndingHere)
       // and the maximum subarray sum seen so far (maxSoFar)
       int maxEndingHere = arr[0];
       int maxSoFar = 0;

       // Iterate through the array from the second element to the end
       for (int i = 1; i < arr.length; i++) {
           // Update maxEndingHere to be the maximum of the current element and the sum of maxEndingHere and the current element
           maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);

           // Update maxSoFar to be the maximum of maxSoFar and maxEndingHere
           maxSoFar = Math.max(maxSoFar, maxEndingHere);
       }

       // After iterating through the entire array, maxSoFar represents the maximum subarray sum
       return maxSoFar;

   }
}
