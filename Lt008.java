import java.util.Arrays;

public class Lt008 {
    public static void main(String[] args) {
        Ans obj = new Ans();
        int a[] = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int b[] = { 2, 3, 4 };
        int n = 3;
        obj.merge(a, m, b, n);
        System.out.println(Arrays.toString(a));
    }
}

class Ans {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m - 1, j = n - 1, k = m + n - 1; j >= 0; --k) {
            nums1[k] = i >= 0 && nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
    }
}
