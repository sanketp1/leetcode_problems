import java.util.*;
public class Main {

    private static Set<Integer> set = new HashSet<>();
    
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int s = 15;
        ArrayList<Integer> result = subarraySum(arr, n, s);

        System.out.println(result);
    }

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int preSum = 0;
//
//        //keeping 0's count as 1
        map.put(0,0);

        for (int i = 0; i < n; i++) {

            ///adding element at current index to preSum
            preSum+=arr[i];

            int removed = preSum-s;

            if(map.containsKey(removed)){
                result.add(map.get(removed)+1);
                result.add(i+1);
                break;
            }

            //as it's zero based indexing
            map.put(preSum,i+1);
        }

        if(result.isEmpty()) result.add(-1);
        return result;
    }
}