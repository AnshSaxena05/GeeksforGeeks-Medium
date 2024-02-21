public class gfg_K_th_element_of_two_Arrays {
    public long kthElement(int arr1[], int arr2[], int m, int n, int k) {

        int arr[] = new int[m + n];
        int i = 0, j = 0, c = 0;
        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                arr[c++] = arr1[i];
                i++;
            } else {
                arr[c++] = arr2[j];
                j++;
            }
        }

        while (i < m) {
            arr[c++] = arr1[i];
            i++;
        }

        while (j < n) {
            arr[c++] = arr2[j];
            j++;
        }

        return arr[k - 1];
    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 3, 5, 7, 9 };
        int[] arr2 = { 2, 4, 6, 8, 10 };

        int m = arr1.length;
        int n = arr2.length;
        int k = 5;

        gfg_K_th_element_of_two_Arrays obj = new gfg_K_th_element_of_two_Arrays();

        long result = obj.kthElement(arr1, arr2, m, n, k);

        System.out.println("The kth element is: " + result);
    }
}
