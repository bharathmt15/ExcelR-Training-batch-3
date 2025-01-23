import java.util.Scanner;

public class Demo034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if is even or odd");
        int val = sc.nextInt();
        if (val % 2 == 0) {
            System.out.println(val + " is a even number");
        } else {
            System.out.println(val + " is a odd number");

        }
        sc.close();

    }
}
