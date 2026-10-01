class Solution {
    public boolean check(int[] nums) {
         int[] check = Arrays.copyOf(nums, nums.length);

        Arrays.sort(check);
  
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            dq.addLast(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (dq.getFirst() < dq.getLast()) break;
            int first = dq.pollFirst();
    

            dq.addLast(first);
                    
        }
        
        for (int i = 0; i < nums.length; i++) {
            int temp = dq.pollFirst();
            if (temp != check[i]) return false;
        }
        
        return true;
        
    }
}