package topics.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        //applying insertion sort
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public  static  void insertionSort(int[] arr){

        //length of array
        int n = arr.length;

        for (int i = 1; i <n ; i++) {
            int key = arr[i];
            int j = i-1;

            while(j>=0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }



}
