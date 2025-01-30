import java.util.*;

public class Demo028 {
    public static void main(String[] args) {
        System.out.print("Enter the range of Fibonacci series ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibonacci fib = new Fibonacci();
        System.out.print("fibo numbers are " + n + " are: ");
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.print(fib.fibonacci(i) + " ");
        }

    }
}

class Fibonacci {
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {

            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}