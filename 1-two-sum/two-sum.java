class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int phanBu = target - nums[i];

            if(map.containsKey(phanBu)) {
                return new int[] {map.get(phanBu), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}