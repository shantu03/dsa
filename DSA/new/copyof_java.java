import java.util.Arrays;

public class copyof_java {
    public static void main(String[] args) {
        int arr[]={2,342,523,52,52,523,5};

        int arr2[]=Arrays.copyOf(arr, 4);
        System.out.println(Arrays.toString(arr2));
    }
}
