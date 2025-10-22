import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class find_the_position_of_element_in_sorted_infinite_array {
    public static void main(String[] args) {
        // int arr[]={1,5,7,8,9,12,17,19,23,40,69,80,99};
        int arr[]=new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Random().nextInt(1000)+1;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int target=new Scanner(System.in).nextInt();
        System.out.println(solution(arr, target));


        
    }
    public static int solution(int arr[],int target)
    {
        int st=0;
        int en=1;
        while (true ) {

            st=en+1;
            en<<=1;
            if(arr[en]>target) break;
        }
        while(st<=en)
        {
            int mid=(en-st)/2+st;

            if(target>arr[mid]) st=mid+1;
            else if(target<arr[mid]) en=mid-1;
            else return mid;
        }
return -1;
    }

}
