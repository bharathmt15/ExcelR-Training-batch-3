import java.util.Scanner;

public class Demo054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to the argument");
        int val = sc.nextInt();
        Mol obj = new Mol();
        obj.m1(val);
        sc.close();
    }
}

class Mol {
    public void m1() {
        System.out.println("no args passed");
    }

    public void m1(int a) {
        System.out.println(a + " was passed as an argument");
    }

    public void m1(int a, int b) {
        System.out.println(a + b + "sum of the two aruments");
    }
}
