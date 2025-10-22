public class rotated_array {
    public static void main(String[] args) {
        int arr[]={2,3,4,9,11,0};

        int st=0;
        int en=arr.length-1;
        int ans=-1;
        while (st<en) {
            int mid=(en-st)/2+st;
            System.out.println(st+" "+mid+" "+en);
            if(arr[st]<arr[en]) { ans=-1;break;}
            if(mid<en && arr[mid]>arr[mid+1]) {ans=mid; break;}

            else if(mid>st && arr[mid-1]>arr[mid]) {ans=mid-1;break;}

             if(arr[st]>arr[mid]) en=mid-1;

            else if(arr[mid]>arr[en]) st=mid+1;
            
        }

        System.out.println(ans+1);
    }
}
