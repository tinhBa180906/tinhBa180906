class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums[nums.length - 1] != nums[nums.length - 2] && nums[nums.length - 1] != nums[nums.length - 3]) 
            return nums[nums.length - 1];
        int result1 = 0;
        for (int i = 0; i < nums.length; i+=2) {
            if (nums[i + 1] != nums[i]) {
                result1 = nums[i];
                break;
            }
        }
        return result1;
    }
}