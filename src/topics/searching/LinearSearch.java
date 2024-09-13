package topics.searching;

public class LinearSearch {

    public static void main(String[] args) {
//        int[] arr = {}
    }

    public static int linearSearch(int[] arr, int target){

        //length of array
        int n = arr.length;

        for(int i = 0; i<n; i++){
            if(arr[i] == target) return i;
        }


        return -1;
    }

}
