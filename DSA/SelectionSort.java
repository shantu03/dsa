public class SelectionSort
{
    public static void main(String[] args){
    
    int[] arr=new int[10];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=new java.util.Random().nextInt(34);
    }

    for(int i:arr){
        System.out.printf(" %d ",i);
    }
    
    int temp=0;
    int high=0;
    for(int i=0;i<arr.length-1;i++)
    {
        int min=i;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[min]>arr[j])
            {
                min=j;
            }
        }
        temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
        
    }
    System.out.println("\n");
    for(int i:arr){
        System.out.printf(" %d ",i);
    }

    }
}