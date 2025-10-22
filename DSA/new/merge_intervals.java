import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        int[][] ans=new int[n][2];
        int k=0;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ans[0]=intervals[0];
        for(int i=1;i<n;i++){
            if(ans[k][1]<intervals[i][0]){
                k++;
                ans[k]=intervals[i];
            }
            else{
                ans[k][1]=Math.max(ans[k][1],intervals[i][1]);
            }
        }
        return Arrays.copyOf(ans,k+1);
        
    }
}