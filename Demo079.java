import java.util.Scanner;

class Demo79 {
    public static void main(String[] args) {
        S79 obj = new S79();
        obj.s79();
    }
}

class S79 {
    public void s79() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Element to find ? ");
        int key = sc.nextInt();

        if (searchElement(arr, key)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

        sc.close();
    }

    public static boolean searchElement(int[] arr, int key) {
        for (int num : arr) {
            if (num == key) {
                return true;
            }
        }
        return false;

    }
}