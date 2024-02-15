import java.util.Arrays;

public class gfg_Triplet_Sum_in_Array {
    public static boolean find3Numbers(int A[], int n, int X) {
        
        Arrays.sort(A);
        for(int i=0;i<n-1;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum= A[i]+A[j]+A[k];
                if(sum==X){
                    return true;
                }
                else if(sum<X){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
    return false;
    }
    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 4, 45, 6, 10, 8};
        int n = arr.length;
        int targetSum = 22;

        boolean result = gfg_Triplet_Sum_in_Array.find3Numbers(arr, n, targetSum);

        if (result) {
            System.out.println("Triplet with the given sum exists.");
        } else {
            System.out.println("Triplet with the given sum does not exist.");
        }
    }
}
