package topics.sliding_window;

/*
    Along one side of road there is a sequence of vacant plots of land each plot has different
    area (non-zero). So, the area from a sequence A[1], A[2], ....A[N]

    You want to buy k acres of land to build a house. you want to find all the segments of contiguous
    plots (i.e. a subsection in the sequence of whose sum is exactly k.)
 */

import java.util.ArrayList;
import java.util.List;

class Pair{
    private int start;
    private int end;

    public Pair(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return start+"->"+end;
    }
}

public class HousingPlots{

    public static void main(String[] args) {

        int[] plots = {1,3,2,1,4,1,3,2,1,1};
        int k = 8;
        List<Pair> result = findPlots(plots,k);

        System.out.println(result);

    }

    public  static List<Pair> findPlots(int[] plots, int k){

        //length of array
        int n = plots.length;

        List<Pair> result = new ArrayList<>();

        int i =0, j =0;
        int currentSum = 0;

        while(j<n){

            //expading widow toward right
            currentSum+=plots[j];
            j++;

            //in-case if widow sum is getting greater than k
            //then reducing window from left
            while(currentSum>k && i<j){
                currentSum-=plots[i];
                i++;
            }

            //if the current sum is equals to k area
            if(currentSum==k){
                result.add(new Pair(i,j-1));
            }
        }


        return  result;
    }
}
