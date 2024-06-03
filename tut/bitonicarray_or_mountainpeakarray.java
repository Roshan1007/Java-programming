// in this problem we are returning the highest number in the bitonic array.
// bitonic array={1,2,3,4,5,6,7,8,7,6,5,4,3,2,1,0} -->  answer=8
//                  <--------   |  -------->
//              increasing order|decreasing order

public class bitonicarray_or_mountainpeakarray {
    public static void main(String[] args){
        int[] arr={1,3,4,2,0};
        int ans=search(arr);
        System.out.println(arr[ans]);
    }
    static int search(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(start==end){
                return start;   //or return end,as the highest element is always at end==start
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;   // because we known that element at mid+1 is greater than mid
            }
            else{
                end=mid;   //because we dont know that element at mod-1 is greater or smaller than mid
            }
        }
        return -1;
    }
}
