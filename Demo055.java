import java.util.Scanner;

public class Demo055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int val = sc.nextInt();
        Sol obj = new Sol();
        obj.sumsqr(val);
        sc.close();

    }

}

class Sol {
    public void sumsqr(int a) {
        int ans = 0;
        if (a > 0) {
            ans += a % 10;
            ans = a * a;
            a /= 10;
            System.out.println(ans);
        } else {
            System.out.println(ans);
        }
    }
}