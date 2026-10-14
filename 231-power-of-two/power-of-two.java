class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
         int log2N = (int)(Math.log(n) / Math.log(2));
        if ((int)Math.pow(2, log2N) == n) return true;
        return false;
    }
}