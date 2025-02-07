public class Demo070 {
    public static void main(String[] args) {
        int[] arr = { 10, 3, 5, 8, 13, 17, 20, 23 };

        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
