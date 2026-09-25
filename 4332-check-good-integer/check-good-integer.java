class Solution {
    public boolean checkGoodInteger(int n) {
        int rawNum = n;

        int sum = 0;
        int square = 0;
        while (rawNum != 0) {
            int mod = rawNum % 10;
            sum += mod;
            square = square + mod * mod;
            rawNum /= 10;
        }
        return square - sum >= 50;
    }
}