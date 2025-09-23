class Solution {
    public int maxArea(int[] height) {
        int max_rec=0;
        int max_st=0;
        int max_en=height.length-1;

            max_rec=(Math.max(height[max_st],height[max_en])-Math.abs(height[max_st]-height[max_en]))*Math.abs((max_st+1)-(max_en+1));

        for(int i=1;i<height.length;i++)
        {
            System.out.print("st = "+max_st+" e = "+max_en+" r = "+max_rec+" \t");
            max_st=(height[max_st]<height[i])?i:max_st;
            
            max_en=(height[max_en]<height[height.length-i-1])?height.length-i-1:max_en;
            
            int k=(Math.max(height[max_st],height[max_en])-Math.abs(height[max_st]-height[max_en]))*Math.abs((max_st+1)-(max_en+1));

            
            max_rec=(k>max_rec)?k:max_rec;
            System.out.println("st = "+max_st+" e = "+max_en+" r = "+max_rec);
            
        }
        return max_rec;
    }
    public int iterative_solution(int[] height)
    {
        int rec=0;

        for (int i = 0; i < height.length; i++) {
            for (int j = height.length-1; j >0; j--) {

                rec=Math.max(rec,((Math.max(height[i],height[j])-Math.abs(height[i]-height[j]))*Math.abs(i-j)));
                
            }
        }
        return rec; 
    }
    
    public int recursion_solution(int[] height,int str_idx,int end_idx)
    {
        if(str_idx>end_idx)
        return 0 ;
        int len=Math.max(height[str_idx],height[end_idx])-Math.abs(height[end_idx]-height[str_idx]);
        int rec=Math.abs(str_idx-end_idx+2)*len;
        rec=Math.max(rec,Math.max(Math.max(recursion_solution(height, str_idx+1, end_idx),
        recursion_solution(height, str_idx, end_idx-1)),
        recursion_solution(height, str_idx+1, end_idx-1)));
        System.out.println("len = "+len+" r = "+rec+" \tstr_idx "+str_idx+" end idx = "+end_idx);
        return rec;
    }
}

public class container_with_most_water {

    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        // System.err.println(new Solution().recursion_solution(arr,0,arr.length-1));
        // System.out.println(new Solution().maxArea(arr));
        System.out.println(new Solution().iterative_solution(arr));

    }
}