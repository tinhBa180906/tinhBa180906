class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] primeList = new boolean[n];
        
        for (int i = 2; i * i <= n; i++) {
            if (!primeList[i]) {
                for (int j = i * i; j < n; j+=i) {
                    primeList[j] = true;
                }
            }
        }
        
        for (int i = 2; i < n; i++) {
            if (!primeList[i]) count++;
        }
        
        return count;


    }

   
    }
