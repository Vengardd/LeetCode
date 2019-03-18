package _198.HouseRobber;

public class HouseRobber {

    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        else if (nums.length == 1)
            return nums[0];
        else if (nums.length == 2)
            return Math.max(nums[0], nums[1]);

        int firstValue = nums[0];
        int secondValue = Math.max(nums[0], nums[1]);
        int maxValue = 0;
        for (int i = 2; i < nums.length; i++) {
            maxValue = Math.max(firstValue+nums[i], secondValue);
            firstValue = secondValue;
            secondValue = maxValue;
        }
        return maxValue;
    }
}
