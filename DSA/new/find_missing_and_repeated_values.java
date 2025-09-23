import java.util.Set;
import java.util.HashSet;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
  	Set<Integer> s =new HashSet<Integer>();
	int rep=0,rem=0,sum=0;
	for (int i=0;i<grid.length;i++)
		{
		for (int j=0;j<grid[0].length;j++)
			{
sum+=grid[i][j];
			if(s.add(grid[i][j])==false)
				rep=grid[i][j];
}}
	int n=grid.length*grid.length;
	rem=(n*(n+1)/2)+rep-sum;
	int arr[]={rep,rem};
			
	return arr;
    }

	public static void main(String a[])
{
int arr[][]={{9,1,7},{8,9,2},{3,4,6}};
int k[]=new Solution().findMissingAndRepeatedValues(arr);

for(int i: k)
{
System.out.println(i);
}

}
}


//my solution 
/*

      boolean flag[]=new boolean[grid.length*grid[0].length];
        int rep=0,rem=0;
        for (int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                int idx=grid[i][j];
                if(flag[idx-1]==true)
                   { rep=idx;
                                       }
                flag[idx-1]=true;
            }
        }



        for(int i=0;i<grid.length*grid[0].length;i++)
        {
	System.out.print(flag[i]+" " );
            if(flag[i]==false)
                {
                    rem=i+1;
                    
                }
        }

    int arr[]={rep,rem};
    return arr;


*/