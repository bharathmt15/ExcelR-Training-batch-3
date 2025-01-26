import java.util.Scanner;

public class Demo053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check strong or not");
        int userinput = sc.nextInt();
        sc.close();

        Strong obj = new Strong();
        boolean isStrong = obj.isStrongNumber(userinput);
        if (isStrong) {
            System.out.println(userinput + " is a Strong number.");
        } else {
            System.out.println(userinput + " is not a Strong number.");
        }
    }
}

class Strong {
    public boolean isStrongNumber(int userinput) {
        int actualnumber = userinput, sum = 0;
        while (userinput > 0) {
            int digit = userinput % 10;
            sum += factorial(digit);
            userinput /= 10;
        }
        return sum == actualnumber;
    }

    public int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n--;
        }
        return fact;
    }
}
