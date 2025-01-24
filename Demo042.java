import java.util.Scanner;

public class Demo042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to convert to uppercase");
        String str = sc.nextLine();
        String lowered = str.toUpperCase();
        System.out.println(lowered);
        sc.close();
    }
}
