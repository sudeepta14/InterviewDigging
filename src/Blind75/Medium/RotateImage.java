package Blind75.Medium;

public class RotateImage {
    /*

    reverse on diagonal
    reverse from left to right
     */
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reflect(matrix);
    }
    public void transpose(int[][] matrix){
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void reflect(int[][] matrix){
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
}
