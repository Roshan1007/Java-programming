public class min_no_search {
    public static void main(String[] args){
        int[] arr={1,4,2,54,-13};
        System.out.println(search(arr));
    }
    static int search(int arr[]){
        if (arr.length==0){
            return -1;
        }
        int temp=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<temp){
                temp=arr[i];
            }
        }
        return temp;
    }
}
