package _200.NumberOfIslands;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfIslandsTest {

    private NumberOfIslands testee = new NumberOfIslands();

    @Test
    void numIslands() {
//        char[][] input = new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        char[][] input = new char[][]{{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};

        int result = testee.numIslands(input);

        assertThat(result).isEqualTo(3);
    }
}