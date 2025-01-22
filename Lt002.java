import java.util.Scanner;

class Lt001 {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lt001 obj = new Lt001();

        int num = sc.nextInt();
        System.out.println(obj.reverse(num));
        sc.close();
    }
}
