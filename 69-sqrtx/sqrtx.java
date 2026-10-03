class Solution {
    public int mySqrt(int x) {
         for (long i = 0; i <= x / 2 + 1; i++) {
            if ( i * i == x) return (int)i;
            else if (i * i > x) return (int)i - 1;
        }
        return 1;
    }
}