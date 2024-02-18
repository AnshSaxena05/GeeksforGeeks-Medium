import java.util.Arrays;

public class gfg_Arranging_the_array {

    public static void rearrange(int[] a, int n) {
        int pointer1 = 0;

        for (int pointer2 = 0; pointer2 < n; pointer2++) {
            if (a[pointer2] < 0) {
                if (pointer1 != pointer2) {
                    int temp = a[pointer2];
                    for (int i = pointer2; i > pointer1; i--) {
                        a[i] = a[i - 1];
                    }
                    a[pointer1] = temp;
                }
                pointer1++;
            }
        }
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n1 = arr1.length;

        System.out.println("Original Array 1: " + Arrays.toString(arr1));
        rearrange(arr1, n1);
        System.out.println("Rearranged Array 1: " + Arrays.toString(arr1));
        System.out.println();

        // Example 2
        int[] arr2 = { 12, 11, -13, -5, 6, -7, 5, -3, -6 };
        int n2 = arr2.length;

        System.out.println("Original Array 2: " + Arrays.toString(arr2));
        rearrange(arr2, n2);
        System.out.println("Rearranged Array 2: " + Arrays.toString(arr2));
    }
}
