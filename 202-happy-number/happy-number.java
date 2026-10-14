class Solution {
    public boolean isHappy(int n) {
        while(true) {
            if (n < 10 && n != 1 && n != 7) return false;
            if (n == 1 || n == 7) break;
            int temp = 0;
            while(n != 0) {
                temp += (int)Math.pow((n % 10), 2);
                n/=10;
            }
            n = temp;
            
        }
        return true;
    }
}