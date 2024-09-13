package topics.sorting;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;

import topics.sorting.BubbleSort;

public class MergeSort {

    private static  int[] getLargeArray(){
        int[] arr = new int[1000000];

        try {
            File file = new File("C:\\Users\\sanket\\Downloads\\large_array.txt");
            FileReader fileReader = new FileReader(file);

            Scanner sc = new Scanner(fileReader);
            int x = 0;
            while (sc.hasNext()){
                arr[x++] = sc.nextInt();
            }


        } catch (IOException e) {
            System.out.println(e.toString());
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }


        return arr;
    }

    public static void main(String[] args) {

        int[] largeArray = getLargeArray();


        ///TESTING
        ///Over 1M items

        // Record the start time
        long startTime = System.currentTimeMillis();

        //Perform Sorting Here
        mergeSort(largeArray,0,largeArray.length-1);
//        BubbleSort sort = new BubbleSort();
//        sort.bubbleSort(largeArray);

        // Record the end time
        long endTime = System.currentTimeMillis();

        // Calculate the time taken
        long duration = endTime - startTime;

        // Output the time taken
        System.out.println("Time taken to sort the array: " + duration + " milliseconds");

        //TEST Result
        //Time Take: 154 ms only
        //while bubble sort not able to compute it even after 5 minutes.



    }

    public static int[] mergeSort(int[] arr){
        if(arr.length==1) return arr;

        int mid = (arr.length)/2;

        //left part of the array
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid, arr.length));

        return merge(left,right);
    }

    public  static  int[] merge(int[] left, int[] right){
        int[] mix = new int[left.length+right.length];


        int k = 0;
        int i = 0;
        int j = 0;

        while (i<left.length && j< right.length){
            if(left[i]<right[j]){
                mix[k++] = left[i++];
            }else{
                mix[k++] = right[j++];
            }
        }

        //remaining element in left array
        while(i< left.length){
            mix[k++] = left[i++];
        }

        //remaining element in right array
        while(j< right.length){
            mix[k++] = right[j++];
        }


        return mix;
    }

    public static void mergeSort(int[] arr, int l, int r){
        if(l==r) return;

        int mid = (l+r)/2;

        //left sub array
        mergeSort(arr,l,mid);

        //right sub array
        mergeSort(arr,mid+1, r);

        //merging both to together
        merge(arr,l,mid,r);

    }

    public static void merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int k = 0;
        int i = left;
        int j = mid+1;

        while(i<=mid && j<=right){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        //remaining elements
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while (j<=right){
            temp[k++] = arr[j++];
        }

        int y = 0;
        for(int x = left; x<=right; x++){
            arr[x] = temp[y];
            y++;
        }
    }


}
