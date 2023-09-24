
public class InsertionSort{
    public static void main(String[] args)
    {
       int [] arr={12,11,13,5,2,6};

         System.out.println("Array ");

        for(int k=0;k<arr.length;k++)
        {
            System.out.printf("  %d  ",arr[k]);
        }
                 System.out.println( );

        int count =1;
       for(int i=1;i<arr.length;i++)
       {

            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                int temp=arr[j];
                arr[j]=key;
                arr[j+1]=temp;                
               
                if(j==(i-1))
                {
                    
                    System.out.println("Pass "+count);
                    count++;
                }
             j--;
        for(int k=0;k<arr.length;k++)
        {
            System.out.printf("  %d  ",arr[k]);
        }
        System.out.println();
            }
       }


        for(int k=0;k<arr.length;k++)
        {
            System.out.printf("  %d  ",arr[k]);
        }

    }
}