public class Main3 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        if (num1 > num2) {
            System.out.println(num1 + " is the greatest");
        } else if (num2 > num3) {
            System.out.println(num2 + " is the greatest");
        } else if (num3 > num1) {
            System.out.println(num3 + " is the greatest");
        } else {
            System.out.println("all are equal");
        }
    }
}
