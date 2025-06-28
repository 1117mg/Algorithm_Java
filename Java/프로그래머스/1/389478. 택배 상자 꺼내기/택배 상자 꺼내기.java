class Solution {
    public int solution(int n, int w, int num) {
        int nF = getF(w, n-1);
        int nIndex = getIndex(w, nF, n-1);
        
        int numF = getF(w, num-1);
        int numIndex = getIndex(w, numF, num-1);
        
        int count = (nF - numF);
        if (nF % 2 == 0) {
            count += (numIndex <= nIndex) ? 1 : 0;
        } else {
            count += (numIndex >= nIndex) ? 1 : 0;
        }
        
        return count;
    }
    
    private int getF(int w, int n) {
        return n/w;
    }
    
    private int getIndex(int w, int f, int n) {
        if(f % 2 == 0){
            return n%w; 
        } else {
            return w - 1 - (n % w);
        }
    }
}