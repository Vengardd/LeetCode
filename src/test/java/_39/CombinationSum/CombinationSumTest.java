package _39.CombinationSum;

import org.junit.jupiter.api.Test;

import java.util.List;

class CombinationSumTest {

    private CombinationSum testee = new CombinationSum();

    @Test
    public void exampleTest() {
        int[] candidates = new int[]{2, 3, 6, 7};

        List<List<Integer>> result = testee.combinationSum(candidates, 7);


    }

}