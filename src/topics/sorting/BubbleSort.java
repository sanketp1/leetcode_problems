package topics.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        //applying bubble sort
        bubbleSort(arr);

        //printing sorted array
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){

        //length of array
        int n = arr.length;

        for(int i = 0; i<n; i++){
            for (int j = 1; j < n-i; j++) {
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }

    }

    private static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
