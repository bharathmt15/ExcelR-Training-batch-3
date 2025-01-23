import java.util.Scanner;

public class Demo037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number");
        int num3 = sc.nextInt();
        System.out.println("enter the fourth number");
        int num4 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater ");
        } else if (num2 > num3) {
            System.out.println(num2 + " is greater ");

        } else if (num3 > num4) {
            System.out.println(num3 + " is greater ");

        } else {
            System.out.println(num4 + " is greater ");
        }
        sc.close();
    }
}
