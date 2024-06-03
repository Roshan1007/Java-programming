// in this question, we are returning the index of first and last index of target element from the array.

public class firstandlastposition {
    public static void main(String[] args){
        int[] arr={5,7,7,7,7,8,8,10};
        int target=8;
        int[] ans=searchrange(arr,target);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    static int[] searchrange(int[] arr, int target){
        int[] ans={-1, -1};
        ans[0]=search(arr, target, true);
        if(ans[0]!=-1){
            ans[1]=search(arr, target, false);
        }
        return ans;
    }
    static int search(int[] arr, int target, boolean isStartelement){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+(end-start)%2);
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(isStartelement){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
