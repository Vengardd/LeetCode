package _26.RemoveDuplicatesFromArray;

public class RemoveDuplicatesFromArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        int newLength = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
                newLength++;
            }
        }
        return newLength;
    }
}
