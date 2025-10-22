public class find_in_the_mountain_array {
    public static void main(String[] args) {
        
        int arr[]={1,7,9,5,3,1};

        int target=3;
        int peakk=peak(arr);
        
        System.out.println(search(arr, target, 0, peakk));
        

    }
    
    static int search(int arr[],int target,int start,int end)
    {
        int st=start;
        int en=end;
        while(st<=en)
        {
            int mid=(en-st)/2+st;

            if(arr[mid]==target) return mid;
            else if(target>arr[mid])st= mid+1;
            else en=mid-1;
        }
        
        
         st=end;
         en=arr.length-1;

        while(st<=en)
        {
            int mid=(en-st)/2+st;

            if(arr[mid]==target) return mid;
            else if(target>arr[mid])
            en=mid-1;
            else st= mid+1;
        }
        
        return -1;
    }
    static int peak(int arr[])
    {
        int st=0;
        int en=arr.length-1;
        while(st<en)
    {
        int mid=(en-st)/2+st;
        if(arr[mid]>arr[mid+1]) en=mid;
       else  st=mid+1;
    }


    
    return st;
    }
}
