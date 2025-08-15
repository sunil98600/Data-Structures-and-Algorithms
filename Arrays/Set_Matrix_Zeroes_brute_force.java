public class Set_Matrix_Zeroes_brute_force{
  public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] rowMarkers = new boolean[rows];
        boolean[] colMarkers = new boolean[cols];
        
        // First pass: Identify the rows and columns that need to be set to zero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowMarkers[i] = true;
                    colMarkers[j] = true;
                }
            }
        }
        
        // Second pass: Update the matrix based on the markers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowMarkers[i] || colMarkers[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

    public static void printMatrix(int[][] matrix){
      int row = matrix.length;
        int col = matrix[0].length;
      for(int i=0;i<row;i++){
            for(int j=0;j< col;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    } 

    public static void main(String[] args){
      int[][] matrix ={{1,1,1},{1,0,1},{1,1,1}};
      setZeroes(matrix);
      printMatrix(matrix);
    }
}