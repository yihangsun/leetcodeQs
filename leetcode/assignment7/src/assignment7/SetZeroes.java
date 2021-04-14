package assignment7;

import java.util.Arrays;

public class SetZeroes {
	
	public static void main(String[] args) {
		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		setZeroes(matrix);
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
	
	public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean zeroCol = false;
        boolean zeroRow = false;
        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) zeroRow = true;
        }
        for (int i = 0; i < col; i++) {
            if (matrix[0][i] == 0) zeroCol = true;
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        if (zeroCol) {
            for (int i = 0; i < col; i++) {
                matrix[0][i] = 0;
            }
        }
        
        if (zeroRow) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
