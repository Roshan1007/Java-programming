import java.util.Arrays;

public class sorted_matrix_binarysearch {
    public static void main(String[] args){
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,1)));
    }
    //search in the row between the columns
    static int[] binarySearch(int [][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(target==matrix[row][mid]){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]>target){
                cEnd=mid-1;
            }
            else{
                cStart=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(rows==1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;

        //run the loop till 2 rows are remaining
        while(rStart<(rEnd-1)){   //while this is true it will be more than two rows
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if (matrix[mid][cMid]<target) {
                rStart=mid;
            }
            else{
                rEnd=mid;
            }
        }
        //Now only two rows are remaining.
        //searching if the target element is in the mid col of remaining 2 rows.
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }
        //searching in 1st half of remaining rows.
        if(target<=matrix[rStart][cMid-1]){
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        //searching in 2nd half of remaining rows.
        if(target>=matrix[rStart][cMid+1]){
            return binarySearch(matrix, rStart, cMid+1, cols-1, target);
        }        
        //searching in 3rd half of remaining rows.
        if(target<=matrix[rStart+1][cMid-1]){
            return binarySearch(matrix, rStart+1, 0, cMid-1, target);
        }        
        else{
        //searching in 4th half of remaining rows.
        return binarySearch(matrix, rStart+1,cMid+1,cols-1, target);
        }      
        
    }
}
