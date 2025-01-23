import java.util.Scanner;

public class Demo035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is greater ");
        } else {
            System.out.println(num2 + " is greater ");

        }
        sc.close();
    }
}
