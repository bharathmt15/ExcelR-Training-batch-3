import java.util.Scanner;

public class Demo007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your Phone_no: ");
        String number = scanner.nextLine();

        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
        System.out.println("My number is: " + number);

        scanner.close();
    }
}