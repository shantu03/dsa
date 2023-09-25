public class MergeSort{
    public static void divide(int arr[],int s,int e)
    {

        if(e>s)
        {
                  int m=s+(e-s) /2;
        
        divide(arr,s,m);
        divide(arr,m+1,e); 
         conqure(arr,s,m,e); 
        }

       
    }
    public static void conqure(int arr[],int s, int m, int e)
    {
        int L[]=new int[m-s+1];
        int R[]=new int[e-m];
        for(int i=0;i<L.length;i++)
        {
            L[i]=arr[s+i];
        }
        for(int i =0;i<R.length;i++)
        {
            R[i]=arr[m+1+i];
        }
        int l=L.length;
        int r=R.length;
        int i=0,j=0,k=s;
        while(i<l && j<r)
        {
            if(L[i]<=R[j])
            {
                arr[k]=L[i];
                i++;
            }
            else
            {
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<l)
        {
            arr[k++]=L[i++];  
        }
        while(j<r){
            arr[k++]=R[j++];
        }
        
        /*
        int temp[]=new int[s+(e-s)+1];
        int indx1=s;
        int indx2=m+1;
        
        int index=0;

        while(indx1<=m && indx2<=e)
        {
            if(arr[indx1]<=arr[indx2])
            {
                temp[index++]=arr[indx1++];
                
            }
            else{
                temp[index++]=arr[indx2++];
            }
        }

        while(indx1<=m)
        {
            temp[index++]=arr[indx1++];
        }
        while(indx2<=e)
        {
            temp[index++]=arr[indx2++];
        }

        for(int i=0,j=s;i<temp.length;i++,j++)
        {
            arr[j]=9;
        }*/
    }

    public static void main(String [] args)
{
    // System.out.println("sjkdalf");
    
    int arr[]={5,3,2,15,1,25};

    divide(arr,0,arr.length-1);

    for(int i:arr)
    {
        System.out.printf("  %d  ",i);
    }
}
}