public class BubbleSort{
    static void printArray(int arr[])
    {
    for(int ii=0;ii<arr.length;ii++)
        {
            System.out.printf("  %d  ",arr[ii]);
        }  System.out.printf("\n");
    }


    static void SortArray(int[] arr)
    {
        
        int last=arr.length;
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println("Pass "+ (i+1));
            for(int j=1;j<last;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

                printArray(arr);
            }

            last--;
        }  
    }
    public static void main(String[] args){
        
        // int arr[]={6,0,3,5};
        int arr[] =new int[new java.util.Random().nextInt(8)];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=new java.util.Random().nextInt(23);
        }
        
        System.out.printf("\nARRAY - \n");

        printArray(arr);
        SortArray(arr);
        System.out.printf("\nARRAY - \n");

        printArray(arr);




   


    }
}