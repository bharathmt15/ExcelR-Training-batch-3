import java.util.Scanner;

public class Demo052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check amstrong or not ");
        int usernum = sc.nextInt();
        sc.close();
        int amstrong_number = usernum, sum = 0;
        while (usernum > 0) {
            int digit = usernum % 10;
            sum += digit * digit * digit;
            usernum /= 10;

        }
        if (sum == amstrong_number) {
            System.out.println("is a amstrong nubmer");
        } else {
            System.out.println("is not a amstrong number");
        }

    }
}
