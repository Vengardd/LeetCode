package _1.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indicesByOppositeValues = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (indicesByOppositeValues.containsKey(nums[i])) {
                return new int[]{indicesByOppositeValues.get(nums[i]), i};
            }
            int oppositeValue = target - nums[i];
            indicesByOppositeValues.put(oppositeValue, i);
        }
        throw new RuntimeException();
    }

    // O(n^2)
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++)
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
        }
        throw new IllegalArgumentException();
    }
}
