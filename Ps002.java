import java.util.Scanner;

public class Ps002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int roundedNumber = roundToHundred(number);
        System.out.println("Rounded number: " + roundedNumber);
        scanner.close();
    }

    public static int roundToHundred(int num) {
        int remainder = num % 100;
        if (remainder >= 50) {
            return num + (100 - remainder);
        } else {
            return num - remainder;
        }
    }
}