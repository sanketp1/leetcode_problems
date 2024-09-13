package topics.sorting;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Tester {

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



        return arr;
    }

    public static void main(String[] args) {

        int[] arr = getLargeArray();

        //length of array
        int n = arr.length;

        QuickSort quickSort = new QuickSort();


        // Record the start time
        long startTime = System.currentTimeMillis();

        //Perform Sorting Here
        QuickSort.quickSort(arr,0,n-1);

        // Record the end time
        long endTime = System.currentTimeMillis();

        // Calculate the time taken
        long duration = endTime - startTime;

        // Output the time taken
        System.out.println("Time taken to sort the array: " + duration + " milliseconds");

    }
}
