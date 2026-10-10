class Solution {
    public int climbStairs(int n) {
        if (n == 2 || n == 3 || n == 1 || n == 0) return n;
        
        int[] result = new int[n + 1];
        result[2] = 2;
        result[3] =3;
        for (int i = 4; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        
        return result[n];
    }
}