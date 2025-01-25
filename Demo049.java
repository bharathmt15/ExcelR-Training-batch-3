import java.util.Scanner;

public class Demo049 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number to reverse ");
        int num = sc.nextInt();
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;

        }
        System.out.println(reversed);
        sc.close();
    }
}
