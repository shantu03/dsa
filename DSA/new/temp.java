import java.util.Scanner;
class Solution{
    public int marxSubArray(int[] num){
        int max_sum=0>num[0]?num[0]:0;
        for(int i=0;i<num.length;i++)
        {
            for(int j=i;j<num.length;j++)
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

    public static void main(String a[])
    {
        String str=new Scanner(System.in).nextLine();

        String p[]=str.split(",");

        int arr[]=new int[p.length];

        String q[]=p[0].split("=");

        if(p[0].charAt(0)!='[')
            p[0]=q[1];

        for(int i=0;i<arr.length;i++)
        {
           int  sign=1;

            if(p[i].charAt(0)=='-'||i==0&&p[0].charAt(1)=='-')
                sign=-1;
            String one=p[i].replaceAll("\\D","");

            arr[i]=Integer.parseInt(one)*sign;
        }


        System.out.println(new Solution().marxSubArray(arr));
    }
    
}