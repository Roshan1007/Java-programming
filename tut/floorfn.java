/**
 * floorfn-
 * finding greatest number lesser than or equal to target.
 * 
 * after the loop is voilated, then the end is greatest element which is smaller or equal to target !!!
 */
public class floorfn {
    public static void main(String[] args){
        int[] arr={2,4,6,8,12,14,16,19};
        int target=11;
        int ans=search(arr,target);
        System.out.println(arr[ans]);
    }
    static int search(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start +(end-start)/2);  
            if(arr[mid]>target){
                end=mid-1;
            }
            else if (arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
