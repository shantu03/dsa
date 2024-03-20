import java.util.Random;

public class reverse_a_array {
    public static void main(String args[]) {
        int arr[] = new int[new Random().nextInt(50)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
        }
        System.out.println("before : ");
        for (int i : arr) {
            System.out.printf("%d  ", i);
        }

        with_two_pointer(arr);
        System.out.println("After  : ");
        for (int i : arr) {
            System.out.printf("%d  ", i);

        }

        with_single_pointer(arr);

        System.out.println("After  : ");
        for (int i : arr) {
            System.out.printf("%d  ", i);

        }
    }

    static void with_single_pointer(int[] arr) {
        System.out.printf("\n\n USING SINGLE POINTER : \n\n");
        fun(0, arr);

    }

    static void with_two_pointer(int[] arr) {

        System.out.printf("\n\n USING TWO POINTER : \n\n");
        fun(0, arr.length - 1, arr);

    }

    static void fun(int i, int[] arr) {
        if (i >= arr.length / 2) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
        fun(i + 1, arr);
    }

    static void fun(int i, int j, int[] arr) {
        if (i >= arr.length / 2)
            return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        // System.out.println(i+"\t"+j); TESTING

        fun(i + 1, j - 1, arr);

    }
}