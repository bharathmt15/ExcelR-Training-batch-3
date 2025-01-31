import java.util.Scanner;

public class Demo057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int val = sc.nextInt();
        Ans obj = new Ans();
        obj.lastsum(val);
        sc.close();
    }
}

class Ans {
    void lastsum(int a) {
        int sum;
        int last = a;
        int first = a;
        while (first > 9 || last > 9) {
            first = first % 10;
            last = last / 10;

        }
        sum = first + last;
        System.out.println(sum);

    }

}