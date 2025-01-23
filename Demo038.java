import java.util.Scanner;

public class Demo038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter to check it's case");
        char word = sc.next().charAt(0);
        if (Character.isUpperCase(word)) {
            System.out.println(word + " is capital letter ");
        } else if (Character.isLowerCase(word)) {
            System.out.println(word + " is small letter");
        } else {
            System.out.println("it is not a character");
        }
        sc.close();
    }
}
