import java.util.Scanner;

class Demo80 {
    public static void main(String[] args) {
        S80 obj = new S80();
        obj.s80();
    }
}

class S80 {
    public void s80() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        shiftLeft(arr);

        System.out.println("Array after left shift:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static void shiftLeft(int[] arr) {
        if (arr.length == 0)
            return;

        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;

    }
}