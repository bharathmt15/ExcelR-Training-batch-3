import java.util.Scanner;

public class Demo020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms to print: ");
        int n = scanner.nextInt();
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        scanner.close();
    }
}
