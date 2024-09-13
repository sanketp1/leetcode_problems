package problems;

import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sort012 {

    public static void main(String[] args)  {

        int total = 65754;
        int[] arr = new int[total];
        int i = 0;

        try {
            FileReader x = new FileReader("C:\\Users\\sanket\\Desktop\\leetcode_problems\\input.txt");
            Scanner sc = new Scanner(x);
            while (sc.hasNext()){
                int num = sc.nextInt();
                arr[i] = num;
                i++;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

//        System.out.println(arr);

////        int arr[] = {0, 1, 0};
//        int arr[]= {0, 2, 1, 2 ,0};
        int n = arr.length;
        sort012(arr,n);

//        System.out.println(Arrays.toString(arr));
    }

    public static void sort012(int a[], int n)
    {
       //sort 0's
        int newStart = sortHelper(a,0,n-1,0);

        //sort 1's
        sortHelper(a,newStart,n-1,1);
    }

    private static int sortHelper(int[] arr, int start, int end, int num){

        while(start<end){
            while(arr[start] == num) start++;
            if(arr[end] == num){
                swap(arr,start,end);
            }
            end--;
        }

        return start;
    }

    private static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
