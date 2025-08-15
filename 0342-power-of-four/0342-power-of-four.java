class Solution {
    public boolean isPowerOfFour(int n) {
        double logFour = Math.log(n)/Math.log(4);
        return 0 == (logFour - (int)(logFour));    
    }
}