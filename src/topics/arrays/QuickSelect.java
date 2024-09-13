package topics.arrays;

public class QuickSelect {

    public static void main(String[] args) {
       int[]  nums1 = {3,2,3,1,2,4,5,5,6};
       int k1 = 4;

       int[] nums2 = {3,2,1,5,6,4};
       int k2 = 2;

       //length of the array
       int n1 = nums1.length;
       int n2 = nums2.length;

       //considering 0-based indexing
        //that's why passing k-1 instead of k
       int result1 = quickSelect(nums1,0,n1-1,k1-1,true);
       int result2 = quickSelect(nums2, 0, n2-1,k2-1,true);

       System.out.println(result1);
       System.out.println(result2);

    }

    public static int quickSelect(int[] arr, int left, int right, int k, boolean isRev){

        int pivotIndex = partition(arr,left,right, isRev);

        if(pivotIndex==k){
            return arr[pivotIndex];
        }

        if(pivotIndex<k){
            //operating right part of the array
            return quickSelect(arr,pivotIndex+1,right,k, isRev);
        }
        else{
            //otherwise operating
            //in right part of the array
            return quickSelect(arr,left,pivotIndex-1,k, isRev);
        }

    }

    public static int partition(int[] arr, int left, int right, boolean rev){
        //pivot
        //considering last element as the pivot
        int pivot = arr[right];

        int i = left-1;

        while(left<right){
            if( rev? arr[left] > pivot :arr[left]<pivot){
                swap(arr,i+1,left);
                i++;
            }
            left++;
        }

        swap(arr,++i,right);

        return i;
    }

    public  static void  swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

}
