import java.util.Arrays;

public class gfg_Swapping_pairs_make_sum_equal {
    long findSwapValues(long A[], int n, long  B[], int m)
    {
        Arrays.sort(A);Arrays.sort(B);
        long aSum=0,bSum=0;
        int x=0,y=0;
        for(long i:A) aSum+=i;
        for(long i:B) bSum+=i;
        while(x<n && y<m){
            long aTemp=aSum-A[x]+B[y];
            long bTemp=bSum-B[y]+A[x];
            if(aTemp==bTemp) return 1;
            else if(aTemp<bTemp) y++;
            else x++;
        }
        return -1;
    }
    public static void main(String[] args) {
        // Example usage
        long[] A = {4, 1, 2, 1, 1, 2};
        int n = A.length;
        
        long[] B = {3, 6, 3, 3};
        int m = B.length;
        
        gfg_Swapping_pairs_make_sum_equal solution = new gfg_Swapping_pairs_make_sum_equal();
        long result = solution.findSwapValues(A, n, B, m);
        
        if (result == 1) {
            System.out.println("Swapping pairs found. The sums are equal.");
        } else {
            System.out.println("No swapping pairs found. The sums are not equal.");
        }
    }
}
