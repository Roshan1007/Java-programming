// in this problem we are finding element in bitonic array
// first we are finding of arraythen we are searching for array as per their order (increasing/decreasing) 
// using order agnostic binary search


public class findinginbitonicarray {
    public static void main(String[] args){
        int[] arr={1,2,4,5,6,7,5,4,3};
        int target=7;
        int answer=ans(arr,target);
        System.out.println("Element is at index "+answer);
    }
    static int ans(int[] arr, int target){
        int peak=bitonicarray_or_mountainpeakarray(arr);
        int ascen_order=order_agnostic_binary_search(arr,target,0,peak);
        if(ascen_order!=-1){
            return ascen_order;
        }
        else{
            // descn_order=order_agnostic_binary_search(arr,target,peak+1,arr.length-1);
            // return descn_order;
            return order_agnostic_binary_search(arr,target,peak+1,arr.length-1);
        }
    }
    static int order_agnostic_binary_search(int[] arr, int target, int start,int end){
        while(start<=end){
            int mid= end+(start-end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[start]>arr[end]){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }

    static int bitonicarray_or_mountainpeakarray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(start==end){
                // return end;
                return start;
            }
            else if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
