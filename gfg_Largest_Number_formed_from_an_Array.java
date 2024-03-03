import java.util.Arrays;

public class gfg_Largest_Number_formed_from_an_Array {
    String printLargest(int n, String[] arr) {
        // code here
        Arrays.sort(arr,(a,b)->{
            String t=""+a+b;
            String m=""+b+a;
            return m.compareTo(t);
            
        });
        StringBuilder sb =new StringBuilder();
        for(String item:arr) sb.append(item);
        return sb.toString();
    }
    public static void main(String[] args) {
        gfg_Largest_Number_formed_from_an_Array largestNumberFormer = new gfg_Largest_Number_formed_from_an_Array();

        int n = 4; // replace with the actual size of your array
        String[] arr = {"54", "546", "548", "60"}; // replace with your array elements

        String result = largestNumberFormer.printLargest(n, arr);

        System.out.println("Largest number formed is: " + result);
    }
}
