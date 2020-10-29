package _64.MinimumPathSum;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int[][] helpingArray = new int[grid.length][grid[0].length];

        helpingArray[0][0] = grid[0][0];

        for (int i = 1; i < grid.length; i++) {
            helpingArray[i][0] = helpingArray[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < grid[0].length; j++) {
            helpingArray[0][j] = helpingArray[0][j - 1] + grid[0][j];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                helpingArray[i][j] = grid[i][j] + Math.min(helpingArray[i - 1][j], helpingArray[i][j - 1]);
            }
        }

        return helpingArray[grid.length - 1][grid[0].length - 1];
    }
}

