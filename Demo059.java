
import java.util.Scanner;

public class Demo059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        Prime obj = new Prime();
        obj.prime(value);
        sc.close();
    }
}

class Prime {
    public void prime(int a) {
        if (a < 2) {
            System.out.println(a + " is not a prime number");
            return;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                System.out.println(a + " is not a prime number");
                return;
            }
        }
        System.out.println(a + " is a prime number");
    }
}
