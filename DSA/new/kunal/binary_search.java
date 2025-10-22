
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        int arr[]={2,4,5,9,14,16,18};

        // int arr[]=new int[10];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]=new Random().nextInt(125);
        // }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // System.out.println("idx ="+(my_binary_search(arr, 0, arr.length-1, 10)+1));

        System.out.println(arr[while_binary_search(arr, new Scanner(System.in).nextInt())]);
        
    }
    static int while_binary_search(int arr[],int target){
        int st=0;
        int en=arr.length-1;
        int mid=0;
        while(st<=en){

             mid=(en-st)/2+st;

            if(arr[mid]==target) return mid;

            else if(target>arr[mid]) st=mid+1;

            else en=mid-1;
        }
        // if(arr[mid]<target)
        //  return -2;

        return st;

    }
    static int my_binary_search(int arr[],int st,int en,int target){

        int mid=(en-st)/2+st;
        if(st>en)
        {
            return mid;
        }
        

        if(arr[mid]==target)
            return mid;

        else if(target>mid){
            return my_binary_search(arr, mid+1, en, target);
        }else
        {
           return my_binary_search(arr, st, mid-1, target);
        }

        
    }
}
