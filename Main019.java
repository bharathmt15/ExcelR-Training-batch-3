import java.util.Scanner;

public class Main019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int number = scanner.nextInt();
        int remainder = number % 10;
        int rounded = remainder < 5 ? number - remainder + 5 : number - remainder + 10;
        System.out.println("Rounded number: " + rounded);
        scanner.close();
    }
}
