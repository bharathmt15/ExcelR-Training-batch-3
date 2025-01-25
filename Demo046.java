import java.util.Scanner;

public class Demo046 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check leap year or not: ");
        int year = sc.nextInt();
        System.out.println(year % 4 == 0 && year % 100 != 0 ? year + " is a leap year" : "not a leap year");
        sc.close();
    }

}