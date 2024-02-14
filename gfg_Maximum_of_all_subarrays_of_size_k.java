import java.util.ArrayList;

public class gfg_Maximum_of_all_subarrays_of_size_k {
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0; i<=n-k ; i++){
            int max= getMax(arr,i,i+k);
            ar.add(max);
        }
        return ar;
    }
    static int getMax(int arr[],int l,int r){
        int max= arr[l];
        for(int i=l;i<r;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int n = arr.length;
        int k = 3;

        ArrayList<Integer> result = gfg_Maximum_of_all_subarrays_of_size_k.max_of_subarrays(arr, n, k);

        System.out.println("Maximum of all subarrays of size " + k + ": " + result);
    }
}
