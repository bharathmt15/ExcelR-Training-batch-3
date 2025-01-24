import java.util.Scanner;

public class Demo044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter second number");
        int num2 = sc.nextInt();
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("after swapping " + num1 + " " + num2);
        sc.close();
    }
}
