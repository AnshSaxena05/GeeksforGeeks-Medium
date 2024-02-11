public class gfg_Majority_Element{
    static int majorityElement(int a[], int size){
        int res=0,count=1;
        for(int i=1;i<size;i++){
            if(a[i]==a[res])
                count++;
            else
                count--;
            if(count == 0){
                count=1;
                res=i;
            }
        }
        count =0;
        for(int i=0;i<size;i++)
        {
            if(a[i]==a[res])
                count++;
        }
        if(count<=size/2)
            return -1;
        
        
        return a[res];
    }
    public static void main(String[] args) {
        int[] array = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int size = array.length;
        for(int num:array)
        {
            System.out.print(num+" ,");
        }
        System.out.println("");
        int result = gfg_Majority_Element.majorityElement(array, size);

        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No Majority Element found");
        }
    }
}
