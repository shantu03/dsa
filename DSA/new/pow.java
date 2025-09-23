public class pow{
    public static void main(String a[])
    {
        int n=8;
        String str=Integer.toBinaryString(n);
        int ans=1;
        int x=2;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)=='1')
                ans*=x;
            
            x*=x;
        }
        System.err.println(ans);
    }
}