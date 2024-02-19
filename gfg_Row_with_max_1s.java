public class gfg_Row_with_max_1s {
    int rowWithMax1s(int arr[][], int n, int m) {
        int res=0;
        int result=-1;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1)
                    count+=1;
            }
            if(count > res){
                res= count;
                result=i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        gfg_Row_with_max_1s solution = new gfg_Row_with_max_1s();

        // Example test case
        int[][] matrix = {
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 1}
        };

        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns

        int result = solution.rowWithMax1s(matrix, n, m);

        if (result != -1) {
            System.out.println("Row with the maximum number of 1s: " + result);
        } else {
            System.out.println("No row with 1s found.");
        }
    }
}
