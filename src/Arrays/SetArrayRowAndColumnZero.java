package Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/set-matrix-zeroes/description/
public class SetArrayRowAndColumnZero {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [] col = new int[n];
        int [] row = new int[m];

        Arrays.fill(col, 0);
        Arrays.fill(row, 0);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0 && (row[i] == 1 || col[j] == 1)) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

//    private void markColumn(int[][] matrix, int n, int m, int i, int j) {
//        for (int x = 0 ; x < m; x++) {
//            if (matrix[x][j] != 0) {
//                matrix[x][j] = -1;
//            }
//        }
//    }
//
//    private void markRow(int[][] matrix, int n, int m, int i, int j) {
//        for (int x = 0 ; x < n; x++) {
//            if (matrix[i][x] != 0) {
//                matrix[i][x] = -1;
//            }
//        }
//
//    }
    public static void main (String[] args) {
        SetArrayRowAndColumnZero obj = new SetArrayRowAndColumnZero();
        int [][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        obj.setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
