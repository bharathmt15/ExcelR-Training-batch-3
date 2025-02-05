import java.util.Scanner;

public class Demo061 {

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        Demo061 obj = new Demo061();

        System.out.println("\nPrime numbers from 1 to " + n);
        for (int i = 1; i <= 10; i++) {
            if (obj.isPrime(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}