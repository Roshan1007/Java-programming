// in this problem we are finding the element from array of infinite size.


public class binarysearchininfinitearray {
    public static void main(String[] args){
        int[] arr={1,3,5,7,9,13,14,15,18,19,23,25,29,34,37,29,45,48,51,59};
        int target=5;
        int answer=ans(arr,target);
        System.out.println(answer);
    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newstart=end+1;
            // in below line, the value of end is end+(end-(start+1))*2 in simpler form
            end=end+(end-start+1)*2;               
            start=newstart;
        }
        return search(arr,target,start,end);
    }
    static int search(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=(start+(end-start)/2);
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
