import java.util.Scanner;

public class Demo036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        System.out.println("enter the third number");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater ");
        } else if (num2 > num3) {
            System.out.println(num2 + " is greater ");

        }
        sc.close();
    }
}