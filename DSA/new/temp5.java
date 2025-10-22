import java.lang.reflect.Array;
import java.util.Arrays;

public class temp5{
    public static void main(String[] args) {
        int arr[]={1,315,1353,25};

        int arr2[]=new int[arr.length+1];
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        for (int i : arr2) {
            System.out.println(i);
        }


    }
}