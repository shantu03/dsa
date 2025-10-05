public class search_in_2d_array {
    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(new Solution().searchMatrix(arr, 61));
    }
}
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]<=target && matrix[i][matrix[0].length-1]>=target)
            {
                for (int j = 0; j < matrix[0].length; j++) {
                    if(matrix[i][j]==target)
                    return true;
                    
                }
            }
            
            
        }
        return false;
    }
}
