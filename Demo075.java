import java.util.Scanner;

public class Demo075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the arrya elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        int max = arr[maxIndex];
        System.out.println("gratest number: " + max);
        sc.close();
    }
}