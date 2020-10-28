package _39.CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> actual = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, result, actual);
        return result;
    }

    private void dfs(int[] candidates, int target, int actualIndex, List<List<Integer>> result, List<Integer> actual) {
        int summedList = sumList(actual);
        if (summedList == target) {
            result.add(new ArrayList<>(actual));
        } else if (summedList > target) {
            return;
        } else {
            for (int i = actualIndex; i < candidates.length; i++) {
                actual.add(candidates[i]);
                dfs(candidates, target, i, result, actual);
                actual.remove(actual.size() - 1);
            }
        }
    }

    private int sumList(List<Integer> actual) {
        return actual.stream()
                .flatMapToInt(IntStream::of)
                .sum();
    }
}
