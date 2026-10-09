class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         Map<Integer, Integer> window = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(window.containsKey(nums[i]) && i - window.get(nums[i])  <= k) {
                return true;
            }
            else window.put(nums[i], i);
        }
        
        return false;
    }
}