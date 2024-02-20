public class gfg_Boolean_Matrix {
    // Function to modify the matrix such that if a matrix cell matrix[i][j]
    // is 1 then all the cells in its ith row and jth column will become 1.
    static class Solution {
        void booleanMatrix(int matrix[][]) {
            boolean mat[][] = new boolean[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == 1) {
                        // Update the entire row
                        for (int k = 0; k < matrix[i].length; k++) {
                            mat[i][k] = true;
                        }

                        // Update the entire column
                        for (int k = 0; k < matrix.length; k++) {
                            mat[k][j] = true;
                        }
                    }
                }
            }
            // Replicate the mat[][] into matrix[][](original array)
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (mat[i][j]) {
                        matrix[i][j] = 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example matrix
        int[][] matrix = {
                {1, 0, 0, 1},
                {0, 0, 1, 0},
                {0, 0, 0, 0}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Call the booleanMatrix method to modify the matrix
        solution.booleanMatrix(matrix);

        System.out.println("\nModified Matrix:");
        printMatrix(matrix);
    }

    // Helper method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
