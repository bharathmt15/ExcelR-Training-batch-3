import java.util.Scanner;

public class Demo051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to check palindrome or not ");
        int num = sc.nextInt();
        int originalNum = num;
        int palin = 0;

        while (num > 0) {
            int digit = num % 10;
            palin = palin * 10 + digit;
            num /= 10;
        }

        if (originalNum == palin) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sc.close();
    }
}
