
import java.util.*;

public class HackerEarth {
    public static void main(String[] args) {
        Hack obj = new Hack();
        obj.s84();
    }
}

class Hack {
    public void s84() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        // Read the size of the array
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");

        // Read the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // This set will track the numbers seen so far in the prefix
        Set<Integer> present = new HashSet<>();

        // Variable to track the current mex
        int mex = 0;

        // Result to store MEX for each prefix
        List<Integer> result = new ArrayList<>();

        // Process each element in the array
        for (int i = 0; i < n; i++) {
            // Add the current element to the set
            present.add(arr[i]);

            // Update mex: find the smallest number not present in the set
            while (present.contains(mex)) {
                mex++;
            }

            // Add the current mex to the result
            result.add(mex);
        }

        // Output the result
        for (int mexValue : result) {
            System.out.print(mexValue + " ");
        }
        sc.close();
    }
}