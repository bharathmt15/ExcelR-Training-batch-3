import java.util.Scanner;

public class Main9 {

    public static void main(String[] args) {
        Main9 main = new Main9();
        int Balance = 1000;
        main.userdetails(1, Balance, "1234567890");
        main.display(1, Balance, "1234567890");
    }

    void userdetails(int id, int balance, String ph_no) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id: ");
        id = sc.nextInt();
        System.out.println("Enter your bank balance: ");
        balance = 1000;
        System.out.println("Enter your phone number: ");
        ph_no = sc.next();
        sc.close();
    }

    void display(int id, int balance, String ph_no) {
        System.out.println("User details: ");
        System.out.println("Your id is " + id);
        System.out.println("Your bank balance is " + balance);
        System.out.println("Your phone number is " + ph_no);
    }
}