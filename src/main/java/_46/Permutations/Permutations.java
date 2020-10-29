package _46.Permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutations(result, nums, new ArrayList<>());
        return result;
    }


    public void permutations(List<List<Integer>> results, int[] nums, List<Integer> actual) {
        if (actual.size() == nums.length) {
            results.add(new ArrayList<>(actual));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (actual.contains(nums[i])) continue;
                actual.add(nums[i]);
                permutations(results, nums, actual);
                actual.remove(actual.size() - 1);
            }
        }
    }
}

