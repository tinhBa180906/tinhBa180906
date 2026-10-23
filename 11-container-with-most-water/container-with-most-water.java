class Solution {
    public int maxArea(int[] height) {
         int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int area = (right - left) * (height[left] > height[right] ? height[right] : height[left]);
            if(area > maxArea) maxArea = area;
            if(height[right] <= height[left]) right--;
            else left++;
        }
        
        
        return maxArea;
    }
}