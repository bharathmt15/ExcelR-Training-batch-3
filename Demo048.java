import java.util.Scanner;

public class Demo048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a int value");
        int num = sc.nextInt();
        num = Math.abs(num);
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        System.out.println(result);
        sc.close();
    }
}
