import java.util.Scanner;

public class Demo040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter to check it's case");
        char word = sc.next().charAt(0);
        if (Character.isUpperCase(word)) {
            System.out.println(word + " is capital letter ");
        } else if (Character.isLowerCase(word)) {
            System.out.println(word + " is small letter");
        } else if (Character.isDigit(word)) {
            System.out.println(word + " is a digit");

        } else if (Character.isLetter(word)) {
            System.out.println(word + " is a letter ");
        } else if (Character.isWhitespace(word)) {
            System.out.println(word + " is a blank space ");
        } else {
            System.out.println(" is a special character ");
        }

        sc.close();
    }
}
