import java.util.Scanner;

class Demo060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        Fibonacci fib = new Fibonacci();
        fib.printFibonacci(num);
        sc.close();
    }
}

class Fibonacci {
    void printFibonacci(int n) {
        int a = 0, b = 1;
        // System.out.print(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
