import java.util.Arrays;

public class Lt006 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 4, 5, 6, 7 };
        int k = 0;
        for (int x : arr) {
            if (k == 0 || x != arr[k - 1]) {
                arr[k++] = x;
            }
        }
        int[] result = Arrays.copyOf(arr, k);
        System.out.println(Arrays.toString(result));
    }
}
