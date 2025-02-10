import java.util.Scanner;

public class Demo073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        sc.close();

        Duplicate obj = new Duplicate(arr);
        obj.printdup();
    }
}

class Duplicate {
    private int[] arr;

    public Duplicate(int[] arr) {
        this.arr = arr;
    }

    public void printdup() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}
