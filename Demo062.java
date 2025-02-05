public class Demo062 {

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };

        int n = arr.length;
        for (int i = 0; i < n; i++) {

            if (n >= 2) {
                System.out.println(arr[0] + " " + arr[1] + " " + arr[n - 1]);
                break;

            }

        }
    }
}