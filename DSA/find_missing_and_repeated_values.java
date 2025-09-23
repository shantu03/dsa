class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        boolean flag[]=new boolean[Math.pow(grid.length,grid.length)];
        int rep=0,rem=0;
	System.out.println(grid[4]);
        for (int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                int idx=grid[i][j];
                if(flag[idx-1]==true)
                   { rep=idx;
                    break;
                   }
                flag[idx-1]=true;
            }
        }



        for(int i=0;i<grid.length*grid.length;i++)
        {
            if(flag[i]==false)
                {
                    rem=i+1;
                    break;
                }
        }

    int arr[]={rep,rem};
    return arr;
    }
}