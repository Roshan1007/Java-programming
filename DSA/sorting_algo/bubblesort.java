import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args){
        int[] arr={1,2,4,2,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            boolean swap=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
}
