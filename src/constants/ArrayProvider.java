package constants;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayProvider {


    static private int[] getLargeLengthArray(String path,int length){
        int[] result = new int[length];

        try{
            FileReader reader = new FileReader(path);
            Scanner sc = new Scanner(reader);
            int k = 0;
            while(sc.hasNext()){
                result[k++] = sc.nextInt();
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    static  public int[] getLargeUnsortedArray() {
        String filePath = "..\\..\\large_unsorted_array.txt";
        int length = 1000000;
        return getLargeLengthArray(filePath,length);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getLargeUnsortedArray()));
    }


}
