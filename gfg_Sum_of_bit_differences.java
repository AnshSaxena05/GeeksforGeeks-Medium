public class gfg_Sum_of_bit_differences {
    long sumBitDifferences(int[] arr, int n) {
        long ans = 0;
        for (int i = 31; i >= 0; i--) {
            long count_zero = 0, count_one = 0;
            for (int j : arr) {
                if (((1 << i) & j) > 0) {
                    count_one++;
                } else
                    count_zero++;
            }
            ans += 2 * (count_zero * count_one);
        }
        return ans;
    }

    public static void main(String[] args) {

        gfg_Sum_of_bit_differences obj = new gfg_Sum_of_bit_differences();
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        long result = obj.sumBitDifferences(arr, n);
        System.out.println("Sum of bit differences: " + result);
    }
}
