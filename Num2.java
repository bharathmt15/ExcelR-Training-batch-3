import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "";

        while (true) {
            System.out.println("Enter yes or no: ");
            res = sc.nextLine().intern();

            if (res == "yes") {
                System.out.println("happy sankranthi");
                break;
            }
        }

        sc.close();
    }
}
