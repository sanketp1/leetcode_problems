package topics.arrays;

/*

You are given a list of integers nums. You can reduce the length of nums by taking any two integers, removing them, and appending their sum to the end. The cost of doing this is the sum of the two integers you removed.

Return the minimum total cost of reducing nums to one integer.

Note : Cost can be negative also.

Constraints

    n ≤ 100,000 where n is length of nums.


Example :

Input

    nums = [1, 2, 3, 4, 5]

Output

    33

Explanation

    We take 1 and 2 out to get [3, 4, 5, 3]

    We take 3 and 3 out to get [4, 5, 6]

    We take 4 and 5 out to get [6, 9]

    We take 6 and 9 out to get [15]

    The sum is 33 = 1 + 2 + 3 + 3 + 4 + 5 + 6 + 9

 */

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class OneInteger {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        int result = solve(nums);
        System.out.println(result);
    }


    static int solve(List<Integer> nums){
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        for (int i = 0; i < nums.size(); i++) {
            pQueue.add(nums.get(i));
        }

        int result = 0;
        while(pQueue.size()!=1){
            int x = pQueue.poll();
            int y = pQueue.poll();
            result = result + x+y;
            pQueue.add(x+y);
        }

        return result;
    }

}
