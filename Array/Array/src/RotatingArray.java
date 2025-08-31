import java.util.Arrays;

public class RotatingArray {
    // INPUT: 12345   --> 21543 --> 34512
    // OUTPUT: 34512
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, 4, 2);
        System.out.println(Arrays.toString(arr));


    }

    public static void rotate(int[] arr, int n, int d) {
        rev(arr, 0, d - 1);
        rev(arr, d , n );
        rev(arr, 0, n);
    }


    public static void rev(int[] arr, int i, int j) {

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
