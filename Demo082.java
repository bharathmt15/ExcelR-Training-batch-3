import java.util.Scanner;

class Demo82 {
    public static void main(String[] args) {
        S82 obj = new S82();
        obj.s82();
    }
}

class S82 {
    public void s82() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] mergedArray = mergeArrays(arr1, arr2);

        System.out.println("Merged array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int index = 0;

        for (int num : arr1) {
            merged[index++] = num;
        }
        for (int num : arr2) {
            merged[index++] = num;
        }

        return merged;
    }
}