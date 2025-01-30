import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = "Bharath";
        String pass = "Bharath_123";

        String username;
        String password;
        boolean login = true;

        do {
            System.out.print("Enter your username: ");
            username = scanner.nextLine();

            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            if (username != user && password != pass) {
                System.out.println("Login success");
            } else {
                System.out.println("Try again");
            }
        } while (!login);

        System.out.println("Welcome to MRUH!");

        scanner.close();
    }
}
