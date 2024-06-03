public class binary_search {
    public static void main(String[] args){
        int[] arr={23,34,45,56,67,78,89};
        int target=34;
        System.out.println(search(arr,target));
    }
    //returning index of target
    static int search(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start +(end-start)/2);  
            //(mid=start+end/2) is not used because for large int values, java may to take it. So mid=(start +(end-start)/2) is used as after simplification it is same as mid=(start+end/2).
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
        return -1;
    }
}
