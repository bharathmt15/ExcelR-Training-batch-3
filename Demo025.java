import java.util.Scanner;

public class Demo025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any long string: ");
        String name = sc.nextLine();
        System.out.println(strrev(name));
        sc.close();
    }

    public static String strrev(String a) {
        return new StringBuilder(a).reverse().toString();
    }
}
