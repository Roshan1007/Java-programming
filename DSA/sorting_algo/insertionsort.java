//this algo sorts intial elements and then in each iteration next index element(i) compares its previous element(i-1) and sort the array.
/*for ex-
 * arr= 42615
 *      24615
 *      24615
 *      24165 -> 21465 -> 12465
 *      12456 => sorted array.
 */


import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args){
        int[] arr={4,2,6,1,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
    
}
