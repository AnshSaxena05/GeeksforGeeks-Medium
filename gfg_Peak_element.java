public class gfg_Peak_element {
    public int peakElement(int[] arr,int n)
    {
       int start =0,end=n-1;
       while(start<=end){
           int mid=(start+end)/2;
           if((mid==0||(arr[mid-1]<=arr[mid]))&&(mid ==n-1||(arr[mid+1]<= arr[mid])))
                return mid;
            if(arr[mid]>arr[mid+1])
                end = mid - 1;
            else
                start = mid+1;
       }
       return 0;
    }
    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 5, 7};
        int n = 5;

        gfg_Peak_element peakElementFinder = new gfg_Peak_element();
        int peakIndex = peakElementFinder.peakElement(arr, n);

        System.out.println("The peak element is at index: " + peakIndex);
    }
}
