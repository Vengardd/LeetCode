package _213.HouseRobberII;

public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
    }

    public int rob(int[] nums, int start, int end) {
        int first = nums[start];
        int second = Math.max(nums[start], nums[start + 1]);
        int actualMax = Math.max(first, second);
        for (int i = start + 2; i < end; i++) {
            actualMax = Math.max(first + nums[i], second);
            first = second;
            second = actualMax;
        }
        return actualMax;
    }
}

