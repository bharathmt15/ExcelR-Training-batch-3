import java.util.Scanner;

class Demo81 {
    public static void main(String[] args) {
        S81 obj = new S81();
        obj.s81();
    }
}

class S81 {
    public void s81() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printLeaders(arr);

        sc.close();
    }

    public static void printLeaders(int[] arr) {
        int n = arr.length;
        int maxRight = arr[n - 1];

        System.out.print("Leader elements: " + maxRight + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                System.out.print(maxRight + " ");
            }
        }

    }
}