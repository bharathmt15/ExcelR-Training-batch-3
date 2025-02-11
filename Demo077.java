import java.util.Scanner;
import java.util.Arrays;

public class Demo077 {
    public static void main(String[] args) {
        S77 obj = new S77();
        obj.s77();
    }
}

class S77 {
    public void s77() {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the arrya elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = arr;
        System.out.println("Elements copied: " + Arrays.toString(arr2));
        sc.close();
    }
}