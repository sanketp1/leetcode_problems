package topics.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2};
        //applying selection sort
        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){

        //length of array
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            //getting max element index
            int maxElementIdx = getMaxElementIndex(arr,n-i-1);
            //swapping them
            swap(arr,maxElementIdx,n-i-1);
        }

    }

    private static int getMaxElementIndex(int[] arr,  int end){
        //consider element at 0th index is the largest element
        int max = 0;

        for(int i = 1; i<=end; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }

        return max;
    }

    private static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

}
