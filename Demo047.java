import java.util.Scanner;

public class Demo047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check the digits: ");
        int num = sc.nextInt();
        num = Math.abs(num);
        int count = 0;
        do {
            count++;
            num /= 10;
        } while (num > 0);
        System.out.println(count);
        sc.close();
    }
}
