public class split_array_largest_sum {

    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5,6,7,4};
        // int arr[]={1,2,3,4,5};
        int arr[]={1,2,3,0,7};

        System.out.println(S(arr, 2));
    }
    static int S(int[] arr,int k)
    {

        int st=-1;
        int en=0;

        for (int i = 0; i < arr.length; i++) {
            st=Math.max(st, arr[i]);

            en+=arr[i];
        }
        System.out.println(st+" "+en);

        while(st!=en)
        {
            int mid=(st+en)/2;
            int pieces=0;
            for (int i = 0; i < arr.length;) {
                int sum=0;
                pieces++;
                System.out.print("mid = "+mid+" { ");
                while(i<arr.length) {
                    if((sum+arr[i])>mid) break;
                    System.out.print(arr[i]+", ");
                    sum+=arr[i++];
                }
                System.out.print( "}");
                // System.out.println("mid = "+mid+" sum = "+sum+" pei = "+pieces);
            }
            System.out.println();
            if(pieces<=k) en=mid;
            else st=mid+1;
        }
    
        return st ;
    }
    
}