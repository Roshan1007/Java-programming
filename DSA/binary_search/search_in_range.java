public class search_in_range {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int target=5;
        System.out.println(search(arr,target,1,5));
    }
    static boolean search(int arr[],int target, int start, int end){
        if(arr.length==0){
            return false;
        }
        for(int i=start;i<end;i++){
            if(target==arr[i]){
                return true;
            }
        }
        return false;
    }
}
