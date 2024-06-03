// order agnoistic means arr in either asending order or descing order.
public class order_agnostic_binary_search {
    public static void main(String[] args){
        // int [] arr={12,23,34,45,56};
        int [] arr={98,87,76,65,54,43,34,21};
        int target=34;
        System.out.println(search(arr,target));
    }
    static int search(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    
}
