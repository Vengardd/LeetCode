package _53.MaximumSubarray;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int actualSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (actualSum > 0)
                actualSum += nums[i];
            else
                actualSum = nums[i];
            maxSum = Math.max(actualSum, maxSum);
        }
        return maxSum;
    }
}
