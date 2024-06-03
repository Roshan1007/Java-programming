// in this question, return the index of smallest element which is greater than the target element.
// if the greater element doesnt exist return the 0th index.

public class nextgreatestchar {
    public static void main(String [] args){
        int[] arr={2,4,6,8,9,13,16,25,28};
        int target=28;
        int ans=search(arr,target);
        System.out.println(arr[ans]);
    }
    static int search(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start +(end-start)/2);  
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start%arr.length;
    }
}
