class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                list.add(nums[i]);
                i++;
            }
        }
        
        return list;
    }
}