package topics.sorting;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

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
        int[] arr = getLargeArray();
        //length of array
        int n = arr.length;

        //applying quick sort
        quickSort(arr,0, n-1);

        System.out.println(Arrays.toString(arr));
    }

    public  static  void  quickSort(int[] arr, int s, int e){
        if(s>=e) return;

        int pivotIndex = partition(arr, s, e);

        //operating in left part of the array
        quickSort(arr,s,pivotIndex-1);

        //operating in right part of the array
        quickSort(arr,pivotIndex+1,e);
    }

    private static int partition(int[] arr, int s, int e) {
        int pivot = arr[e];

        int i = s-1;
        int j = s;

        while(j<e){
            if(pivot>arr[j]){
                swap(arr,i+1,j);
                i++;
            }
            j++;
        }

        //last swap for pivot correct position
        swap(arr,i+1,e);
        //incrementing index to pivot
        i++;

        return i;
    }

    private static  void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
