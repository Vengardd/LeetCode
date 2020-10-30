package _200.NumberOfIslands;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int numberOfIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                char actualChar = grid[i][j];
                if (actualChar == '1') {
                    markActualIsland(grid, i, j);
                    numberOfIslands++;
                }
            }
        }
        return numberOfIslands;
    }

    private void markActualIsland(char[][] grid, int i, int j) {
        if (0 <= i && i < grid.length && 0 <= j && j < grid[0].length) {
            if(grid[i][j] == '1') {
                grid[i][j] = '2';
                markActualIsland(grid, i - 1, j);
                markActualIsland(grid, i, j - 1);
                markActualIsland(grid, i + 1, j);
                markActualIsland(grid, i, j + 1);
            }
        }
    }
}
