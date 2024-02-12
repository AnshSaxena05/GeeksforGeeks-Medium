import java.util.Arrays;

public class gfg_Minimize_the_Heights_II {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        
        int ans = arr[n-1] - arr[0];
        int tmin=Integer.MAX_VALUE;
        int tmax=0;
        for(int i=0;i<n-1;i++){
            
            tmin= Math.min(arr[0]+k,arr[i+1]-k);
            tmax= Math.max(arr[i]+k, arr[n-1]-k);
            if(tmin<0)
                continue;
            ans=Math.min(ans,tmax-tmin);
        }
    return ans;
    }
    public static void main(String[] args) {
        gfg_Minimize_the_Heights_II obj = new gfg_Minimize_the_Heights_II();

        int[] arr = {1, 5, 8, 10};
        int n = arr.length;
        int k = 2;

        int result = obj.getMinDiff(arr, n, k);
        
        System.out.println("Minimum Height Difference: " + result);
    }
}
