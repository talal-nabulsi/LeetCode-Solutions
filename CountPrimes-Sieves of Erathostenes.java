public class Solution {
    public int countPrimes(int n) {
        
        boolean[] isPrime = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2; i < n; i++) {
            
            if (!isPrime[i]) {
                continue;
            }
            
            count++;
            
            
            for (int j = i; j < n; j = j + i) {
                isPrime[j] = false;
            }
            
            
            
        }
        
        return count;
        
        
        
        
    }
}