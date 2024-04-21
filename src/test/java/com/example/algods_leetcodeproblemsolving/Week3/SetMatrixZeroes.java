package com.example.algods_leetcodeproblemsolving.Week3;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {
    /*
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        //checking whether the first col need to be zeroed at the end
        for (int i = 0; i < n; i++) {
            if (matrix[i][0]== 0) {
                firstColZero = true;
            }
        }


        //checking whether the first row need to be zeroed at the end
        for (int j = 0; j < m; j++) {
            if (matrix[0][j]== 0) {
                firstRowZero = true;
            }
        }

        // iterative matrix and mark first row/col to be zeroed
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix [0][j] = 0;
                }
            }
        }
        // updating the matrix with 0 based on first row and column
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix [i][j] = 0;
                }
            }
        }

        if (firstColZero) {
            for (int i = 0; i < n; i ++) {
                matrix[i][0] = 0;
            }
        }

        if (firstRowZero) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;

            }
        }

    }
    */


    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row.contains(i) || col.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
