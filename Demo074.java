import java.util.Scanner;

public class Demo074 {
    public static void main(String[] args) {
        Arsrt obj = new Arsrt();
        obj.arst();
    }
}

class Arsrt {
    public void arst() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("enter array elements ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
