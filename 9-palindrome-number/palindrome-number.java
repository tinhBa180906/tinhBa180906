class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0, y = x;
        while(x > 0) {
            sum = sum * 10 + x % 10;
            x /= 10;
        }
        if(sum == y) return true;
        else return false;
    }
}