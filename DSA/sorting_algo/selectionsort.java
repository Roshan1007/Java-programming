import java.util.Arrays;  // this helps to convert array into string format

public class selectionsort {
    public static void main(String[] args){
        int[] arr={1,4,2,5,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=maxIndex(arr,0,last);
            // swapping the max and last index
            int temp=arr[max];
            arr[max]=arr[last];
            arr[last]=temp;
        }
    }

    // get max index from the array to swap it with the last position that is "last=arr.length-i-1".
    static int maxIndex(int[] arr,int start,int last){
        int max=start;
        for(int i=0;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        // System.out.println(arr[max]);
        return max;
    }
}