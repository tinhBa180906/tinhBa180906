class Solution {
    public boolean checkGoodInteger(int n) {


        int sum = 0;
        int square = 0;
        while (n != 0) {
            int mod = n % 10;
            sum += mod;
            square = square + mod * mod;
            n /= 10;
        }
        return square - sum >= 50;
    }
}