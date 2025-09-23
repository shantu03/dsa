// Maximum Subarray (here no sliding window checkout every possible sub array ) 
//Correct approach -> KADANE APPROACH (CHECK PYTHON VERSION)


//METHOD ?? 
    public static void main(String a[])
    {
        String str=new Scanner(System.in).nextLine();

        String p[]=str.split(",");

        int arr[]=new int[p.length];

        for(int i=0;i<arr.length;i++)
        {
		int sign=-1;
		if(p[i]=='\\d')
            String one=p[i].replace("\\D","");

            arr[i]=Integer.parseInt(one);

		System.out.println(one);
        }

        System.out.println(new max_subarray().marxSubArray(arr));
    }
    
}





----> MY WRONG APPROACH -> TAKING O(n^3) TIME 
/*
    public int marxSubArray(int[] num){
        int max_sum=0;
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=num[k];
                }
                if(max_sum<sum)
                    max_sum=sum;
            }
        }
        
        return max_sum;
    }
*/


