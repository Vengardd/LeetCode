package _1277.CountSquareSubmatricesWtihAllOnes;

import java.util.Arrays;

public class CountSquareSubmatricesWithAllOnes {
    public int countSquares(int[][] matrix) {
        int[][] helpingMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                helpingMatrix[i][j] = matrix[i][j];
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    helpingMatrix[i][j] = minValue(helpingMatrix[i - 1][j], helpingMatrix[i][j - 1], helpingMatrix[i - 1][j - 1]) + 1;
                }
            }
        }
        return Arrays.stream(helpingMatrix)
                .flatMapToInt(Arrays::stream)
                .sum();
    }

    private int minValue(int first, int second, int third) {
        return Math.min(Math.min(first, second), third);
    }
}
