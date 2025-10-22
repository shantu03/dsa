import java.lang.reflect.Array;
import java.util.Arrays;

public class find_first_and_last_position_of_element_in_sorted_array {
    public static void main(String[] args) {
        int arr[]={1,2,2,2,2,3,4,5,5,5,5,6,7,8,9,10,11,12,12,12,12,12,13};

        int target = 2; 
  


        System.out.println(Arrays.toString(search_mid(arr, target, 0, arr.length-1)));
    }static int search(int []arr,int target,boolean finding_start)
    {
        int ans=-1;
        int st=0;
        int en=arr.length-1;

        while(st<=en){
            int mid=(en-st)/2+st;
            if(target>arr[mid]) st=mid+1;
            else if(target<arr[mid]) en=mid-1;
            else{
                ans=mid;//possible answer

                if(finding_start) en=mid-1;
                else st=mid+1;

            }
        }
        return ans;
    }
    
    
    static int[] search_mid(int[] arr,int target,int st,int en)
    {
        int result[]={-1,-1};
        result[0]=search(arr, target, true);

        if(result[0]!=-1)
            result[1]=search(arr, target, false);   
        return result;
    }
}

