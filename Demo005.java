import java.util.Scanner;

public class Demo005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter your password: ");
        String pass = scanner.nextLine();

        if (id == "user001" && pass == "user_001") {
            System.out.println("Welcome user, happy new year! 2K25");
        } else {
            System.out.println("Enter your credentials again.");
        }

        scanner.close();
    }
}