class Demo060 {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        fib.printFibonacci(20);
    }
}

class Fibonacci {
    void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
