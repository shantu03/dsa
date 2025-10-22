import java.util.Arrays;

public class temp {

    public static void main(String[] args) {
        int [][] arr= {{4,5},{1,9}};
        Arrays.sort(arr);
        
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
    }

}