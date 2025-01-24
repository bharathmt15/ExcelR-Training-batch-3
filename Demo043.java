import java.util.Scanner;

public class Demo043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to convert to Lowercase");
        String str = sc.nextLine();
        String lowered = str.toLowerCase();
        System.out.println(lowered);
        sc.close();
    }
}
