class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0, y = x;
        while(x > 0) {
            sum = sum * 10 + x % 10;
            x /= 10;
        }
        return sum == y;
    }
}