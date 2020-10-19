package _221.MaximalSquare;

public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        if (matrix.length == 1) {
            for(int i = 0; i < matrix[0].length; i++) {
                if(matrix[0][i] == '1') {
                    return 1;
                }
            }
            return 0;
        }
        int[][] helpingArray = new int[matrix.length][matrix[0].length];
        int maximumSize = 0;
        for (int i = 0; i < matrix.length; i++) {
            int actualValue = Character.getNumericValue(matrix[i][0]);
            if(actualValue == 1) {
                maximumSize = 1;
            }
            helpingArray[i][0] = actualValue;
        }
        for (int j = 0; j < matrix[0].length; j++) {
            int actualValue = Character.getNumericValue(matrix[0][j]);
            if(actualValue == 1) {
                maximumSize = 1;
            }
            helpingArray[0][j] = actualValue;
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    helpingArray[i][j] = min(helpingArray[i - 1][j - 1], helpingArray[i - 1][j], helpingArray[i][j - 1]) + 1;
                    maximumSize = Math.max(helpingArray[i][j], maximumSize);
                } else {
                    helpingArray[i][j] = 0;
                }
            }
        }
        return maximumSize * maximumSize;
    }

    private int min(int i, int i1, int i2) {
        return Math.min(Math.min(i, i1), i2);
    }
}

