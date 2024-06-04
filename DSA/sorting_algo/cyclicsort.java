/*NOTE-use this algo when the range of array is given 
 * This algo sorts by checking if element at the index should be same as of the index number.
*/
import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args){
        int[] arr={4,2,5,1,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct =arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
    }
    
}
